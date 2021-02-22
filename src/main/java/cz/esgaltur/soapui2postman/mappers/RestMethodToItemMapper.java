package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.RestMethod;
import cz.esgaltur.soapui2postman.generated.soapui.Setting;
import cz.esgaltur.soapui2postman.generated.soapui.StringToStringMap;
import cz.esgaltur.soapui2postman.postman.Header;
import cz.esgaltur.soapui2postman.postman.Item;
import cz.esgaltur.soapui2postman.postman.Request;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.stax2.XMLStreamReader2;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static cz.esgaltur.soapui2postman.constants.SoaupUi2PostmanConstants.ENTRY_TAG_NAME;
import static cz.esgaltur.soapui2postman.unmarshaller.UnmarshallUtils.getStreamReader;
import static cz.esgaltur.soapui2postman.unmarshaller.UnmarshallUtils.getUnmarshallerByClass;

@Mapper(componentModel = "spring")
@Slf4j
public abstract class RestMethodToItemMapper {

    @Autowired
    RestRequestToRequestMapper restRequestToRequest;
    /**
     * Entry to header mapper
     */
    @Autowired
    EntryToHeaderMapper entryToHeaderMapper;


    /**
     * @param restMethod restmethod
     * @return List<Object> of Item
     */
    public List<Object> restResourceToItem(List<RestMethod> restMethod) {
        List<Item> list = new ArrayList<>();
        restMethod.forEach(restMethod1 -> {
            restMethod1.getRequest().forEach(request -> {
                Item item = new Item();
                item.setName(request.getName());
                item.setRequest(restRequestToRequest.restRequestToRequset(request));
                item.getRequest().setMethod(Request.Method.valueOf(restMethod1.getMethod()));
                item.getRequest().setHeader(getHeaderList(request.getSettings().getSetting()));
                list.add(item);
            });
        });
        return new ArrayList<>(list);
    }

    /**
     * XML representation of the headers with key values
     *
     * @param settings setting of header in entry view
     * @return unmarshalled list of headers of the request
     */
    private List<Header> getHeaderList(List<Setting> settings) {
        List<StringToStringMap.Entry> entryTypeList = new ArrayList<>();
        settings.forEach(setting -> {
            final Unmarshaller headerCDATAUnmarshaller;
            try {
                headerCDATAUnmarshaller = getUnmarshallerByClass(StringToStringMap.Entry.class);
                Optional<XMLStreamReader2> xmlStreamReaderHeader = getStreamReader(new ByteArrayInputStream(setting.getValue().getBytes()));
                xmlStreamReaderHeader.ifPresent(xmlStreamReader2 -> {
                    try {
                        while (xmlStreamReader2.hasNext()) {
                            switch (xmlStreamReader2.getEventType()) {
                                case XMLStreamConstants.START_ELEMENT: {
                                    switch (xmlStreamReader2.getName().toString()) {
                                        case ENTRY_TAG_NAME: {
                                            JAXBElement<StringToStringMap.Entry> header = headerCDATAUnmarshaller.unmarshal(xmlStreamReader2, StringToStringMap.Entry.class);
                                             entryTypeList.add(header.getValue());
                                        }
                                    }
                                }
                            }
                            xmlStreamReader2.next();
                        }
                    } catch (XMLStreamException | JAXBException e) {
                        e.printStackTrace();
                    }
                });
            } catch (JAXBException | XMLStreamException e) {
                e.printStackTrace();
            }
        });
        return entryToHeaderMapper.entryListToHeaderList(entryTypeList);
    }
}
