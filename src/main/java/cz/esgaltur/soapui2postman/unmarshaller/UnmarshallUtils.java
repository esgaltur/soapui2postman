package cz.esgaltur.soapui2postman.unmarshaller;

import com.fasterxml.aalto.WFCException;
import com.fasterxml.aalto.stax.InputFactoryImpl;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.codehaus.stax2.XMLInputFactory2;
import org.codehaus.stax2.XMLStreamReader2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamException;
import java.io.InputStream;
import java.util.Optional;

/**
 *
 */
public class UnmarshallUtils {
    /**
     * Default private constructor
     */
    private UnmarshallUtils() {
    }

    /**
     * @param aClass class for getting Marshaller
     * @return Unmarshaller
     * @throws JAXBException
     */
    public static Unmarshaller getUnmarshallerByClass(Class<?> aClass) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(aClass);
        return jaxbContext.createUnmarshaller();
    }

    /**
     * @param countingInputStream InputStream counting
     * @return XMLStreamReader2
     * @throws XMLStreamException
     */
    public static Optional<XMLStreamReader2> getStreamReader(InputStream countingInputStream) throws XMLStreamException {
        try {
            XMLInputFactory2 xmlInputFactory = new InputFactoryImpl();
            xmlInputFactory.configureForSpeed();
            return Optional.of((XMLStreamReader2) xmlInputFactory.createXMLStreamReader(countingInputStream));
        } catch (WFCException e) {
            ExceptionUtils.printRootCauseStackTrace(e);
            return Optional.empty();
        }
    }
}
