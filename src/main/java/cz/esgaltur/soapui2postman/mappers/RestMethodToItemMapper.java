package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.RestMethod;
import cz.esgaltur.soapui2postman.generated.soapui.Setting;
import cz.esgaltur.soapui2postman.generated.soapui.StringToStringMap;
import cz.esgaltur.soapui2postman.postman.Header;
import cz.esgaltur.soapui2postman.postman.Item;
import cz.esgaltur.soapui2postman.postman.Request;
import cz.esgaltur.soapui2postman.postman.Url;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
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
import java.util.UUID;

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
    public List<Item> restMethodToItem(List<Url> urlList, List<RestMethod> restMethod) {
        List<Item> list = new ArrayList<>();
        restMethod.forEach(restMethod1 -> {
            restMethod1.getRequest().forEach(request -> {
                for (Url url : urlList) {
                    Item item = new Item();
                    item.setId(UUID.randomUUID().toString());
                    item.setName(request.getName());
                    item.setRequest(restRequestToRequest.restRequestToRequset(request));
                    item.getRequest().setUrl(url);
                    item.getRequest().setMethod(Request.Method.valueOf(restMethod1.getMethod()));
                    item.getRequest().setHeader(getHeaderList(request.getSettings().getSetting()));
                    item.setVariable(new ArrayList<>());
                    list.add(item);
                }
            });
        });
        return list;
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

                String strippedAndTrimmedValue = setting.getValue().strip().trim();

                if (StringUtils.isBlank(strippedAndTrimmedValue))
                    return;

                if (strippedAndTrimmedValue.equals("true") || (strippedAndTrimmedValue.equals("false")))
                    return;

                if (StringUtils.isNotBlank(strippedAndTrimmedValue)) {
                    headerCDATAUnmarshaller = getUnmarshallerByClass(StringToStringMap.Entry.class);
                    Optional<XMLStreamReader2> xmlStreamReaderHeader = getStreamReader(new ByteArrayInputStream(strippedAndTrimmedValue.getBytes()));

                    xmlStreamReaderHeader.ifPresent(xmlStreamReader2 -> {
                        processHeaderData(entryTypeList, headerCDATAUnmarshaller, xmlStreamReader2);
                        try {
                            xmlStreamReader2.close();
                        } catch (XMLStreamException e) {
                            e.printStackTrace();
                        }
                    });
                }
            } catch (JAXBException e) {
                e.printStackTrace();
            }

        });
        return entryToHeaderMapper.entryListToHeaderList(entryTypeList);
    }

    private void processHeaderData(List<StringToStringMap.Entry> entryTypeList, Unmarshaller headerCDATAUnmarshaller, XMLStreamReader2 xmlStreamReaderHeader) {
        try {
            while (xmlStreamReaderHeader.hasNext()) {

                if ((xmlStreamReaderHeader.isStartElement()) && (ENTRY_TAG_NAME.equals(xmlStreamReaderHeader.getName().toString()))) {

                    JAXBElement<StringToStringMap.Entry> header =
                            headerCDATAUnmarshaller.unmarshal(xmlStreamReaderHeader, StringToStringMap.Entry.class);
                    entryTypeList.add(header.getValue());

                }
                xmlStreamReaderHeader.next();
            }
        } catch (XMLStreamException | JAXBException e) {
            log.error(xmlStreamReaderHeader.getLocation().toString());
            e.printStackTrace();
        }

    }
}
