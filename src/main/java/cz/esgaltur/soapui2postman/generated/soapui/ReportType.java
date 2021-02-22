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
 * <p>Java class for ReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROJECT"/>
 *     &lt;enumeration value="TESTSUITE"/>
 *     &lt;enumeration value="TESTCASE"/>
 *     &lt;enumeration value="LOADTEST"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MONITOR"/>
 *     &lt;enumeration value="MOCKSERVICE"/>
 *     &lt;enumeration value="INTERFACE"/>
 *     &lt;enumeration value="CODE"/>
 *     &lt;enumeration value="COMMON"/>
 *     &lt;enumeration value="SECURITYTESTCASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportType")
@XmlEnum
public enum ReportType {

    PROJECT,
    TESTSUITE,
    TESTCASE,
    LOADTEST,
    UNKNOWN,
    MONITOR,
    MOCKSERVICE,
    INTERFACE,
    CODE,
    COMMON,
    SECURITYTESTCASE;

    public String value() {
        return name();
    }

    public static ReportType fromValue(String v) {
        return valueOf(v);
    }

}
