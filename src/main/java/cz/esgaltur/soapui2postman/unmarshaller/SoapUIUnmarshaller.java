package cz.esgaltur.soapui2postman.unmarshaller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.ValidationMessage;
import cz.esgaltur.soapui2postman.configuration.SoapUi2PostmanConfig;
import cz.esgaltur.soapui2postman.generated.soapui.RestService;
import cz.esgaltur.soapui2postman.mappers.RestServiceToCollectionMapper;
import cz.esgaltur.soapui2postman.postman.Collection;
import cz.esgaltur.soapui2postman.validation.PostmanCollectionValidator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.input.CountingInputStream;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.codehaus.stax2.XMLStreamReader2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import static cz.esgaltur.soapui2postman.constants.SoaupUi2PostmanConstants.INTERFACE_TAG_NAME;
import static cz.esgaltur.soapui2postman.unmarshaller.UnmarshallUtils.getStreamReader;
import static cz.esgaltur.soapui2postman.unmarshaller.UnmarshallUtils.getUnmarshallerByClass;

/**
 * Unmarshaller for SoapUI XML files.
 * This class is responsible for reading SoapUI XML project files and converting them to Postman collections.
 * It uses JAXB for XML unmarshalling and Jackson for JSON serialization.
 */
@Component
@Slf4j
public class SoapUIUnmarshaller {
    /**
     * Jackson ObjectMapper for JSON serialization.
     */
    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Configuration object containing file paths and other settings.
     */
    private final SoapUi2PostmanConfig soapUi2PostmanConfig;

    /**
     * Validator for Postman collections.
     */
    private final PostmanCollectionValidator validator;

    /**
     * Constructor that initializes the unmarshaller and processes the SoapUI XML file.
     * 
     * @param restServiceToCollectionMapper Mapper to convert RestService objects to Collection objects
     * @param soapUi2PostmanConfig Configuration object containing file paths and other settings
     * @param validator Validator for Postman collections
     * @throws IOException If there is an error reading the input file or writing the output file
     * @throws JAXBException If there is an error unmarshalling the XML
     */
    @Autowired
    public SoapUIUnmarshaller(RestServiceToCollectionMapper restServiceToCollectionMapper,
                              SoapUi2PostmanConfig soapUi2PostmanConfig,
                              PostmanCollectionValidator validator)
            throws IOException, JAXBException {
        this.soapUi2PostmanConfig = soapUi2PostmanConfig;
        this.validator = validator;
        processSoapUIXML(restServiceToCollectionMapper);
    }

    /**
     * Processes the SoapUI XML file and converts it to a Postman collection.
     * This method reads the XML file, unmarshalls it to RestService objects,
     * converts them to Collection objects, and writes the result to a JSON file.
     * 
     * @param restServiceToCollectionMapper Mapper to convert RestService objects to Collection objects
     * @throws IOException If there is an error reading the input file or writing the output file
     * @throws JAXBException If there is an error unmarshalling the XML
     */
    private void processSoapUIXML(RestServiceToCollectionMapper restServiceToCollectionMapper) throws IOException, JAXBException {
        // Check if input file exists
        File inputFile = new File(soapUi2PostmanConfig.getFileName());
        if (!inputFile.exists()) {
            String errorMsg = "Input file does not exist: " + soapUi2PostmanConfig.getFileName();
            log.error(errorMsg);
            throw new FileNotFoundException(errorMsg);
        }

        // Check if input file is readable
        if (!inputFile.canRead()) {
            String errorMsg = "Input file is not readable: " + soapUi2PostmanConfig.getFileName();
            log.error(errorMsg);
            throw new IOException(errorMsg);
        }

        // Check if output directory exists, create if it doesn't
        File outputDir = new File(soapUi2PostmanConfig.getOutDir());
        if (!outputDir.exists()) {
            log.info("Output directory does not exist, creating: {}", outputDir.getAbsolutePath());
            if (!outputDir.mkdirs()) {
                String errorMsg = "Failed to create output directory: " + outputDir.getAbsolutePath();
                log.error(errorMsg);
                throw new IOException(errorMsg);
            }
        }

        // Check if output directory is writable
        if (!outputDir.canWrite()) {
            String errorMsg = "Output directory is not writable: " + outputDir.getAbsolutePath();
            log.error(errorMsg);
            throw new IOException(errorMsg);
        }

        CountingInputStream cis = null;
        try {
            cis = new CountingInputStream(new FileInputStream(inputFile));
            Optional<XMLStreamReader2> xmlStreamReaderMainOpt = getStreamReader(cis);

            if (!xmlStreamReaderMainOpt.isPresent()) {
                String errorMsg = "Failed to create XML stream reader for file: " + inputFile.getAbsolutePath();
                log.error(errorMsg);
                throw new IOException(errorMsg);
            }

            Unmarshaller unmarshaller = getUnmarshallerByClass(RestService.class);
            XMLStreamReader2 xmlStreamReaderMain = xmlStreamReaderMainOpt.get();

            try {
                boolean interfaceFound = false;
                while (xmlStreamReaderMain.hasNext()) {
                    switch (xmlStreamReaderMain.getEventType()) {
                        case XMLStreamConstants.START_ELEMENT: {
                            switch (xmlStreamReaderMain.getName().toString()) {
                                case INTERFACE_TAG_NAME: {
                                    interfaceFound = true;
                                    JAXBElement<RestService> restServiceJAXBElement = unmarshaller.unmarshal(xmlStreamReaderMain, RestService.class);
                                    RestService restService = restServiceJAXBElement.getValue();
                                    Collection collection = restServiceToCollectionMapper.restServiceToCollection(restService);
                                    log.info("Successfully converted SoapUI REST service to Postman collection");

                                    // Validate the collection
                                    Set<ValidationMessage> validationMessages = validator.validate(collection);
                                    if (!validationMessages.isEmpty()) {
                                        log.warn("Collection validation failed with {} errors", validationMessages.size());
                                        validationMessages.forEach(message -> log.warn("Validation error: {}", message));
                                    } else {
                                        log.info("Collection validation successful");
                                    }

                                    Path outputPath = getPath();
                                    Files.write(outputPath, objectMapper.writeValueAsBytes(collection));
                                    log.info("Successfully wrote Postman collection to file: {}", outputPath);
                                    break;
                                }
                            }
                        }
                    }
                    xmlStreamReaderMain.next();
                }

                if (!interfaceFound) {
                    log.warn("No REST interface found in the SoapUI project file");
                }

            } catch (XMLStreamException | JAXBException | IOException e) {
                log.error("Error processing SoapUI XML file: {}", e.getMessage());
                log.debug("Stack trace:", e);
                throw new IOException("Error processing SoapUI XML file", e);
            } finally {
                try {
                    xmlStreamReaderMain.closeCompletely();
                } catch (XMLStreamException xmlStreamException) {
                    log.warn("Error closing XML stream reader: {}", xmlStreamException.getMessage());
                }
            }
        } finally {
            if (cis != null) {
                try {
                    cis.close();
                } catch (IOException e) {
                    log.warn("Error closing input stream: {}", e.getMessage());
                }
            }
        }

    }

    /**
     * Generates a path for the output JSON file.
     * The path is constructed using the output directory from the configuration,
     * the name of the input file (converted to lowercase), and a random UUID to ensure uniqueness.
     * 
     * @return Path object representing the output file path
     */
    private Path getPath() {
        Path path = Paths.get(soapUi2PostmanConfig.getOutDir()
                .concat(
                        new File(soapUi2PostmanConfig.getFileName())
                                .getName().toLowerCase(Locale.ROOT).concat("_"+ UUID.randomUUID() +"_.json")));
        log.info("Output file path: {}", path.toString());
        return path;
    }


}
