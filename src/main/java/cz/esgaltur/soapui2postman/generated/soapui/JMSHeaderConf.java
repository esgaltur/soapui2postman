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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JMSHeaderConf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JMSHeaderConf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="JMSCorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="JMSReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="JMSType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="JMSPriority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="JMSDeliveryMode" type="{http://eviware.com/soapui/config}JMSDeliveryModeType" />
 *       &lt;attribute name="TimeToLive" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="durableSubscriptionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageSelector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sendAsBytesMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="soapActionAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JMSHeaderConf")
public class JMSHeaderConf {

    @XmlAttribute(name = "JMSCorrelationID")
    protected String jmsCorrelationID;
    @XmlAttribute(name = "JMSReplyTo")
    protected String jmsReplyTo;
    @XmlAttribute(name = "JMSType")
    protected String jmsType;
    @XmlAttribute(name = "JMSPriority")
    protected String jmsPriority;
    @XmlAttribute(name = "JMSDeliveryMode")
    protected JMSDeliveryModeType jmsDeliveryMode;
    @XmlAttribute(name = "TimeToLive")
    protected String timeToLive;
    @XmlAttribute(name = "durableSubscriptionName")
    protected String durableSubscriptionName;
    @XmlAttribute(name = "clientID")
    protected String clientID;
    @XmlAttribute(name = "messageSelector")
    protected String messageSelector;
    @XmlAttribute(name = "sendAsBytesMessage")
    protected Boolean sendAsBytesMessage;
    @XmlAttribute(name = "soapActionAdd")
    protected Boolean soapActionAdd;

    /**
     * Gets the value of the jmsCorrelationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMSCorrelationID() {
        return jmsCorrelationID;
    }

    /**
     * Sets the value of the jmsCorrelationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMSCorrelationID(String value) {
        this.jmsCorrelationID = value;
    }

    /**
     * Gets the value of the jmsReplyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMSReplyTo() {
        return jmsReplyTo;
    }

    /**
     * Sets the value of the jmsReplyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMSReplyTo(String value) {
        this.jmsReplyTo = value;
    }

    /**
     * Gets the value of the jmsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMSType() {
        return jmsType;
    }

    /**
     * Sets the value of the jmsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMSType(String value) {
        this.jmsType = value;
    }

    /**
     * Gets the value of the jmsPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMSPriority() {
        return jmsPriority;
    }

    /**
     * Sets the value of the jmsPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMSPriority(String value) {
        this.jmsPriority = value;
    }

    /**
     * Gets the value of the jmsDeliveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link JMSDeliveryModeType }
     *     
     */
    public JMSDeliveryModeType getJMSDeliveryMode() {
        return jmsDeliveryMode;
    }

    /**
     * Sets the value of the jmsDeliveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JMSDeliveryModeType }
     *     
     */
    public void setJMSDeliveryMode(JMSDeliveryModeType value) {
        this.jmsDeliveryMode = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeToLive(String value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the durableSubscriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurableSubscriptionName() {
        return durableSubscriptionName;
    }

    /**
     * Sets the value of the durableSubscriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurableSubscriptionName(String value) {
        this.durableSubscriptionName = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the messageSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSelector() {
        return messageSelector;
    }

    /**
     * Sets the value of the messageSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSelector(String value) {
        this.messageSelector = value;
    }

    /**
     * Gets the value of the sendAsBytesMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAsBytesMessage() {
        return sendAsBytesMessage;
    }

    /**
     * Sets the value of the sendAsBytesMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAsBytesMessage(Boolean value) {
        this.sendAsBytesMessage = value;
    }

    /**
     * Gets the value of the soapActionAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoapActionAdd() {
        return soapActionAdd;
    }

    /**
     * Sets the value of the soapActionAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoapActionAdd(Boolean value) {
        this.soapActionAdd = value;
    }

}
