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
 * <p>Java class for TestOnDemandUploadBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestOnDemandUploadBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://eviware.com/soapui/config}TestOnDemandCommand"/>
 *         &lt;element name="Txn" type="{http://eviware.com/soapui/config}TestOnDemandTxn"/>
 *         &lt;element name="Keystore" type="{http://eviware.com/soapui/config}TestOnDemandKeystore"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestOnDemandUploadBody", propOrder = {
    "command",
    "txn",
    "keystore"
})
public class TestOnDemandUploadBody {

    @XmlElement(name = "Command", required = true)
    protected TestOnDemandCommand command;
    @XmlElement(name = "Txn", required = true)
    protected TestOnDemandTxn txn;
    @XmlElement(name = "Keystore", required = true)
    protected TestOnDemandKeystore keystore;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link TestOnDemandCommand }
     *     
     */
    public TestOnDemandCommand getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOnDemandCommand }
     *     
     */
    public void setCommand(TestOnDemandCommand value) {
        this.command = value;
    }

    /**
     * Gets the value of the txn property.
     * 
     * @return
     *     possible object is
     *     {@link TestOnDemandTxn }
     *     
     */
    public TestOnDemandTxn getTxn() {
        return txn;
    }

    /**
     * Sets the value of the txn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOnDemandTxn }
     *     
     */
    public void setTxn(TestOnDemandTxn value) {
        this.txn = value;
    }

    /**
     * Gets the value of the keystore property.
     * 
     * @return
     *     possible object is
     *     {@link TestOnDemandKeystore }
     *     
     */
    public TestOnDemandKeystore getKeystore() {
        return keystore;
    }

    /**
     * Sets the value of the keystore property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOnDemandKeystore }
     *     
     */
    public void setKeystore(TestOnDemandKeystore value) {
        this.keystore = value;
    }

}
