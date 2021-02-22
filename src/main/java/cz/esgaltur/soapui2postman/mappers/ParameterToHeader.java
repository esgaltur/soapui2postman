package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.RestParameter;
import cz.esgaltur.soapui2postman.postman.Header;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParameterToHeader {

    @Mapping(source = "name", target = "key")
    @Mapping(source = "value", target = "value")
    @Mapping(target = "disabled", constant = "false")
    Header parameterToHeader(RestParameter restParameter);

    List<Header> parameterToQuery(List<RestParameter> restParameter);

}
