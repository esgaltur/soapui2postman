package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.RestParameter;
import cz.esgaltur.soapui2postman.postman.Variable;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.xml.namespace.QName;

@Mapper(componentModel = "spring",uses = {QNameToVariableType.class})
public interface ParameterToVariable {

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID().toString())")
    @Mapping(source = "name", target = "key")
    @Mapping(source = "value", target = "value")
    Variable parameterToVariable(RestParameter restParameter);


}
