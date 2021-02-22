package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.postman.Variable;
import org.mapstruct.Mapper;

import javax.xml.namespace.QName;


@Mapper(componentModel = "spring")
public abstract  class QNameToVariableType {


    Variable.Type map(QName value){
        return  Variable.Type.ANY;
    }
}
