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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityScan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}ModelItem">
 *       &lt;sequence>
 *         &lt;element name="config" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="assertion" type="{http://eviware.com/soapui/config}TestAssertion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testStep" type="{http://eviware.com/soapui/config}TestStep"/>
 *         &lt;element name="checkedParameters" type="{http://eviware.com/soapui/config}CheckedParametersList"/>
 *         &lt;element name="executionStrategy" type="{http://eviware.com/soapui/config}ExecutionStrategy"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyForFailedStep" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="runOnlyOnce" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityScan", propOrder = {
    "config",
    "assertion",
    "testStep",
    "checkedParameters",
    "executionStrategy"
})
public class SecurityScan
    extends ModelItem
{

    @XmlElement(required = true)
    protected Object config;
    protected List<TestAssertion> assertion;
    @XmlElement(required = true)
    protected TestStep testStep;
    @XmlElement(required = true)
    protected CheckedParametersList checkedParameters;
    @XmlElement(required = true)
    protected ExecutionStrategy executionStrategy;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "applyForFailedStep")
    protected Boolean applyForFailedStep;
    @XmlAttribute(name = "disabled")
    protected Boolean disabled;
    @XmlAttribute(name = "runOnlyOnce")
    protected Boolean runOnlyOnce;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConfig(Object value) {
        this.config = value;
    }

    /**
     * Gets the value of the assertion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assertion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssertion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestAssertion }
     * 
     * 
     */
    public List<TestAssertion> getAssertion() {
        if (assertion == null) {
            assertion = new ArrayList<TestAssertion>();
        }
        return this.assertion;
    }

    /**
     * Gets the value of the testStep property.
     * 
     * @return
     *     possible object is
     *     {@link TestStep }
     *     
     */
    public TestStep getTestStep() {
        return testStep;
    }

    /**
     * Sets the value of the testStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestStep }
     *     
     */
    public void setTestStep(TestStep value) {
        this.testStep = value;
    }

    /**
     * Gets the value of the checkedParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CheckedParametersList }
     *     
     */
    public CheckedParametersList getCheckedParameters() {
        return checkedParameters;
    }

    /**
     * Sets the value of the checkedParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckedParametersList }
     *     
     */
    public void setCheckedParameters(CheckedParametersList value) {
        this.checkedParameters = value;
    }

    /**
     * Gets the value of the executionStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionStrategy }
     *     
     */
    public ExecutionStrategy getExecutionStrategy() {
        return executionStrategy;
    }

    /**
     * Sets the value of the executionStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionStrategy }
     *     
     */
    public void setExecutionStrategy(ExecutionStrategy value) {
        this.executionStrategy = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the applyForFailedStep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyForFailedStep() {
        return applyForFailedStep;
    }

    /**
     * Sets the value of the applyForFailedStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyForFailedStep(Boolean value) {
        this.applyForFailedStep = value;
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
     * Gets the value of the runOnlyOnce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunOnlyOnce() {
        return runOnlyOnce;
    }

    /**
     * Sets the value of the runOnlyOnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunOnlyOnce(Boolean value) {
        this.runOnlyOnce = value;
    }

}
