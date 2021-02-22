//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.20 at 12:17:50 AM CET 
//


package cz.esgaltur.soapui2postman.generated.soapui;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageContentAssertion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageContentAssertion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elements" type="{http://eviware.com/soapui/config}MessageContentElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="originalMessage" type="{http://eviware.com/soapui/config}CompressedString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageContentAssertion", propOrder = {
    "elements",
    "originalMessage"
})
public class MessageContentAssertion {

    protected List<MessageContentElement> elements;
    @XmlElement(required = true)
    protected CompressedString originalMessage;

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageContentElement }
     * 
     * 
     */
    public List<MessageContentElement> getElements() {
        if (elements == null) {
            elements = new ArrayList<MessageContentElement>();
        }
        return this.elements;
    }

    /**
     * Gets the value of the originalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link CompressedString }
     *     
     */
    public CompressedString getOriginalMessage() {
        return originalMessage;
    }

    /**
     * Sets the value of the originalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressedString }
     *     
     */
    public void setOriginalMessage(CompressedString value) {
        this.originalMessage = value;
    }

}
