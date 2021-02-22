//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.20 at 12:17:50 AM CET 
//


package cz.esgaltur.soapui2postman.generated.soapui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunTestCaseStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunTestCaseStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetTestCase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="properties" type="{http://eviware.com/soapui/config}PropertiesType"/>
 *         &lt;element name="returnProperties" type="{http://eviware.com/soapui/config}StringList"/>
 *         &lt;element name="runMode" type="{http://eviware.com/soapui/config}RunTestCaseRunModeType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="copyLoadTestProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="copyHttpSession" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreEmptyProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunTestCaseStep", propOrder = {
    "targetTestCase",
    "properties",
    "returnProperties",
    "runMode"
})
public class RunTestCaseStep {

    @XmlElement(required = true)
    protected String targetTestCase;
    @XmlElement(required = true)
    protected PropertiesType properties;
    @XmlElement(required = true)
    protected StringList returnProperties;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RunTestCaseRunModeType runMode;
    @XmlAttribute(name = "copyLoadTestProperties")
    protected Boolean copyLoadTestProperties;
    @XmlAttribute(name = "copyHttpSession")
    protected Boolean copyHttpSession;
    @XmlAttribute(name = "ignoreEmptyProperties")
    protected Boolean ignoreEmptyProperties;

    /**
     * Gets the value of the targetTestCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetTestCase() {
        return targetTestCase;
    }

    /**
     * Sets the value of the targetTestCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetTestCase(String value) {
        this.targetTestCase = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setProperties(PropertiesType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the returnProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getReturnProperties() {
        return returnProperties;
    }

    /**
     * Sets the value of the returnProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setReturnProperties(StringList value) {
        this.returnProperties = value;
    }

    /**
     * Gets the value of the runMode property.
     * 
     * @return
     *     possible object is
     *     {@link RunTestCaseRunModeType }
     *     
     */
    public RunTestCaseRunModeType getRunMode() {
        return runMode;
    }

    /**
     * Sets the value of the runMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunTestCaseRunModeType }
     *     
     */
    public void setRunMode(RunTestCaseRunModeType value) {
        this.runMode = value;
    }

    /**
     * Gets the value of the copyLoadTestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyLoadTestProperties() {
        return copyLoadTestProperties;
    }

    /**
     * Sets the value of the copyLoadTestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyLoadTestProperties(Boolean value) {
        this.copyLoadTestProperties = value;
    }

    /**
     * Gets the value of the copyHttpSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyHttpSession() {
        return copyHttpSession;
    }

    /**
     * Sets the value of the copyHttpSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyHttpSession(Boolean value) {
        this.copyHttpSession = value;
    }

    /**
     * Gets the value of the ignoreEmptyProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreEmptyProperties() {
        return ignoreEmptyProperties;
    }

    /**
     * Sets the value of the ignoreEmptyProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreEmptyProperties(Boolean value) {
        this.ignoreEmptyProperties = value;
    }

}
