package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.RestParameter;
import cz.esgaltur.soapui2postman.postman.Query;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParameterToQuery {


    @Mapping(source = "name",target = "key")
    @Mapping(source = "value",target = "value")
    @Mapping(target = "disabled",constant = "false")
    Query parameterToQuery(RestParameter restParameter);


    List<Query> parameterToQuery(List<RestParameter> restParameter);


}
