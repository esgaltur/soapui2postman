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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SensitiveInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensitiveInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}ModelItem">
 *       &lt;sequence>
 *         &lt;element name="configuration" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensitiveInformation", propOrder = {
    "configuration"
})
public class SensitiveInformation
    extends ModelItem
{

    @XmlElement(required = true)
    protected Object configuration;
    @XmlAttribute(name = "level")
    protected String level;

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConfiguration(Object value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

}
