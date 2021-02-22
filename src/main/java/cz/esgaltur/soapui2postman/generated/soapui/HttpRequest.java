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
 * <p>Java class for HttpRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HttpRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}AbstractRequest">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{http://eviware.com/soapui/config}RestParameters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="postQueryString" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="downloadIncludedResources" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="multiValueDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpRequest", propOrder = {
    "parameters"
})
public class HttpRequest
    extends AbstractRequest
{

    @XmlElement(required = true)
    protected RestParameters parameters;
    @XmlAttribute(name = "mediaType")
    protected String mediaType;
    @XmlAttribute(name = "method")
    protected String method;
    @XmlAttribute(name = "postQueryString")
    protected Boolean postQueryString;
    @XmlAttribute(name = "downloadIncludedResources")
    protected Boolean downloadIncludedResources;
    @XmlAttribute(name = "multiValueDelimiter")
    protected String multiValueDelimiter;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link RestParameters }
     *     
     */
    public RestParameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestParameters }
     *     
     */
    public void setParameters(RestParameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the postQueryString property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostQueryString() {
        return postQueryString;
    }

    /**
     * Sets the value of the postQueryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostQueryString(Boolean value) {
        this.postQueryString = value;
    }

    /**
     * Gets the value of the downloadIncludedResources property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadIncludedResources() {
        return downloadIncludedResources;
    }

    /**
     * Sets the value of the downloadIncludedResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadIncludedResources(Boolean value) {
        this.downloadIncludedResources = value;
    }

    /**
     * Gets the value of the multiValueDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiValueDelimiter() {
        return multiValueDelimiter;
    }

    /**
     * Sets the value of the multiValueDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiValueDelimiter(String value) {
        this.multiValueDelimiter = value;
    }

}
