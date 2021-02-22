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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseMockResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseMockResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}ModelItem">
 *       &lt;sequence>
 *         &lt;element name="script" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="responseContent" type="{http://eviware.com/soapui/config}CompressedString"/>
 *         &lt;element name="attachment" type="{http://eviware.com/soapui/config}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://eviware.com/soapui/config}Header" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="httpResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="compression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMockResponse", propOrder = {
    "script",
    "responseContent",
    "attachment",
    "header"
})
@XmlSeeAlso({
    MockResponse.class,
    RESTMockResponse.class
})
public class BaseMockResponse
    extends ModelItem
{

    protected Script script;
    @XmlElement(required = true)
    protected CompressedString responseContent;
    protected List<Attachment> attachment;
    protected List<Header> header;
    @XmlAttribute(name = "httpResponseStatus")
    protected String httpResponseStatus;
    @XmlAttribute(name = "disabled")
    protected Boolean disabled;
    @XmlAttribute(name = "compression")
    protected String compression;
    @XmlAttribute(name = "encoding")
    protected String encoding;

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setScript(Script value) {
        this.script = value;
    }

    /**
     * Gets the value of the responseContent property.
     * 
     * @return
     *     possible object is
     *     {@link CompressedString }
     *     
     */
    public CompressedString getResponseContent() {
        return responseContent;
    }

    /**
     * Sets the value of the responseContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressedString }
     *     
     */
    public void setResponseContent(CompressedString value) {
        this.responseContent = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
    }

    /**
     * Gets the value of the header property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the header property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Header }
     * 
     * 
     */
    public List<Header> getHeader() {
        if (header == null) {
            header = new ArrayList<Header>();
        }
        return this.header;
    }

    /**
     * Gets the value of the httpResponseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpResponseStatus() {
        return httpResponseStatus;
    }

    /**
     * Sets the value of the httpResponseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpResponseStatus(String value) {
        this.httpResponseStatus = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompression(String value) {
        this.compression = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

}