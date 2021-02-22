package cz.esgaltur.soapui2postman.mappers;


import cz.esgaltur.soapui2postman.generated.soapui.StringToStringMap;
import cz.esgaltur.soapui2postman.postman.Header;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 *
 */
@Mapper(componentModel = "spring")
public interface EntryToHeaderMapper {
    /**
     *
     * @param entryType
     * @return
     */
    @Mapping(source = "key", target = "key")
    @Mapping(source = "value", target = "value")
    @Mapping(target = "disabled", constant = "false")
    @Mapping(target = "description", constant = "")
    Header entryToHeader(StringToStringMap.Entry entryType);


    /**
     *
     * @param entryType
     * @return
     */
    List<Header> entryListToHeaderList(List<StringToStringMap.Entry> entryType);

}
