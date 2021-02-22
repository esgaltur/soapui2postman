package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.StringToStringMap;
import cz.esgaltur.soapui2postman.postman.Query;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * EntryToQueryMapper
 */
@Mapper(componentModel = "spring")
public interface EntryToQueryMapper {
    /***
     *
     * @param entry entry
     * @return Query
     */
    @Mapping(source = "key", target = "key")
    @Mapping(source = "value", target = "value")
    Query restParameterToQuery(StringToStringMap.Entry entry);

    /**
     * @param entrys entrys
     * @return List<Query>
     */
    List<Query> restParameterToQuery(List<StringToStringMap.Entry> entrys);

}
