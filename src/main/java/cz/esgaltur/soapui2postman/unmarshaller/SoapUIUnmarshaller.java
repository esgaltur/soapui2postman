package cz.esgaltur.soapui2postman.unmarshaller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cz.esgaltur.soapui2postman.configuration.SoapUi2PostmanConfig;
import cz.esgaltur.soapui2postman.generated.soapui.RestService;
import cz.esgaltur.soapui2postman.mappers.RestServiceToCollectionMapper;
import cz.esgaltur.soapui2postman.postman.Collection;
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
import java.util.Optional;

import static cz.esgaltur.soapui2postman.constants.SoaupUi2PostmanConstants.INTERFACE_TAG_NAME;
import static cz.esgaltur.soapui2postman.unmarshaller.UnmarshallUtils.getStreamReader;
import static cz.esgaltur.soapui2postman.unmarshaller.UnmarshallUtils.getUnmarshallerByClass;

/**
 *
 */
@Component
@Slf4j
public class SoapUIUnmarshaller {
    /**
     *
     */
    private static final ObjectMapper objectMapper = new ObjectMapper();
    /**
     *
     */
    private final SoapUi2PostmanConfig soapUi2PostmanConfig;

    /**
     * @throws FileNotFoundException
     * @throws XMLStreamException
     * @throws JAXBException
     * @throws JsonProcessingException
     */
    @Autowired
    public SoapUIUnmarshaller(RestServiceToCollectionMapper restServiceToCollectionMapper,
                              SoapUi2PostmanConfig soapUi2PostmanConfig)
                              throws IOException, XMLStreamException, JAXBException {
        this.soapUi2PostmanConfig = soapUi2PostmanConfig;
        processSoapUIXML(restServiceToCollectionMapper);
    }

    /**
     * @param restServiceToCollectionMapper
     * @throws IOException
     * @throws XMLStreamException
     * @throws JAXBException
     */
    private void processSoapUIXML(RestServiceToCollectionMapper restServiceToCollectionMapper) throws IOException, XMLStreamException, JAXBException {
        CountingInputStream cis = new CountingInputStream(
                new FileInputStream(soapUi2PostmanConfig.getFileName()));
        Optional<XMLStreamReader2> xmlStreamReaderMainOpt = getStreamReader(cis);
        Unmarshaller unmarshaller = getUnmarshallerByClass(RestService.class);
        xmlStreamReaderMainOpt.ifPresent(xmlStreamReaderMain -> {
            try {
                while (xmlStreamReaderMain.hasNext()) {
                    switch (xmlStreamReaderMain.getEventType()) {
                        case XMLStreamConstants.START_ELEMENT: {
                            switch (xmlStreamReaderMain.getName().toString()) {
                                case INTERFACE_TAG_NAME: {
                                    JAXBElement<RestService> restServiceJAXBElement = unmarshaller.unmarshal(xmlStreamReaderMain, RestService.class);
                                    RestService restService = restServiceJAXBElement.getValue();
                                    Collection collection = restServiceToCollectionMapper.restServiceToCollection(restService);
                                    Files.write(getPath(), objectMapper.writeValueAsBytes(collection));
                                    break;
                                }
                            }
                        }
                    }
                    xmlStreamReaderMain.next();
                }
            } catch (XMLStreamException | JAXBException | IOException e) {
                ExceptionUtils.printRootCauseStackTrace(e);
            }


        });

    }

    /**
     * @return
     */
    private Path getPath() {
        return Paths.get(soapUi2PostmanConfig.getOutDir()
                .concat(
                        new File(soapUi2PostmanConfig.getFileName())
                                .getName().concat("_processed.json")));
    }


}
