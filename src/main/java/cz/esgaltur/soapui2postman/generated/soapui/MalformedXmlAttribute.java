//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.20 at 12:17:50 AM CET 
//


package cz.esgaltur.soapui2postman.generated.soapui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MalformedXmlAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MalformedXmlAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leaveAttributeOpen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insertInvalidChars" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mutateAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newAttributeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newAttributeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addNewAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MalformedXmlAttribute", propOrder = {
    "leaveAttributeOpen",
    "insertInvalidChars",
    "mutateAttributes",
    "newAttributeName",
    "newAttributeValue",
    "addNewAttribute"
})
public class MalformedXmlAttribute {

    protected boolean leaveAttributeOpen;
    protected boolean insertInvalidChars;
    protected boolean mutateAttributes;
    @XmlElement(required = true)
    protected String newAttributeName;
    @XmlElement(required = true)
    protected String newAttributeValue;
    protected boolean addNewAttribute;

    /**
     * Gets the value of the leaveAttributeOpen property.
     * 
     */
    public boolean isLeaveAttributeOpen() {
        return leaveAttributeOpen;
    }

    /**
     * Sets the value of the leaveAttributeOpen property.
     * 
     */
    public void setLeaveAttributeOpen(boolean value) {
        this.leaveAttributeOpen = value;
    }

    /**
     * Gets the value of the insertInvalidChars property.
     * 
     */
    public boolean isInsertInvalidChars() {
        return insertInvalidChars;
    }

    /**
     * Sets the value of the insertInvalidChars property.
     * 
     */
    public void setInsertInvalidChars(boolean value) {
        this.insertInvalidChars = value;
    }

    /**
     * Gets the value of the mutateAttributes property.
     * 
     */
    public boolean isMutateAttributes() {
        return mutateAttributes;
    }

    /**
     * Sets the value of the mutateAttributes property.
     * 
     */
    public void setMutateAttributes(boolean value) {
        this.mutateAttributes = value;
    }

    /**
     * Gets the value of the newAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAttributeName() {
        return newAttributeName;
    }

    /**
     * Sets the value of the newAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAttributeName(String value) {
        this.newAttributeName = value;
    }

    /**
     * Gets the value of the newAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAttributeValue() {
        return newAttributeValue;
    }

    /**
     * Sets the value of the newAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAttributeValue(String value) {
        this.newAttributeValue = value;
    }

    /**
     * Gets the value of the addNewAttribute property.
     * 
     */
    public boolean isAddNewAttribute() {
        return addNewAttribute;
    }

    /**
     * Sets the value of the addNewAttribute property.
     * 
     */
    public void setAddNewAttribute(boolean value) {
        this.addNewAttribute = value;
    }

}