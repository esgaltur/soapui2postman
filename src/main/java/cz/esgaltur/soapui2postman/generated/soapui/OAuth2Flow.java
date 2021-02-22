//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.20 at 12:17:50 AM CET 
//


package cz.esgaltur.soapui2postman.generated.soapui;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OAuth2Flow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OAuth2Flow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHORIZATION_CODE_GRANT"/>
 *     &lt;enumeration value="IMPLICIT_GRANT"/>
 *     &lt;enumeration value="RESOURCE_OWNER_PASSWORD_CREDENTIALS"/>
 *     &lt;enumeration value="CLIENT_CREDENTIALS_GRANT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OAuth2Flow")
@XmlEnum
public enum OAuth2Flow {

    AUTHORIZATION_CODE_GRANT,
    IMPLICIT_GRANT,
    RESOURCE_OWNER_PASSWORD_CREDENTIALS,
    CLIENT_CREDENTIALS_GRANT;

    public String value() {
        return name();
    }

    public static OAuth2Flow fromValue(String v) {
        return valueOf(v);
    }

}
