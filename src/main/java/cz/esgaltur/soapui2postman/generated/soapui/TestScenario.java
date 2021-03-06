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
 * <p>Java class for TestScenario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestScenario">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}ModelItem">
 *       &lt;sequence>
 *         &lt;element name="beforeRunScript" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="afterRunScript" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="runType" type="{http://eviware.com/soapui/config}TestSuiteRunTypes" />
 *       &lt;attribute name="abortOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="failOnErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScenario", propOrder = {
    "beforeRunScript",
    "afterRunScript"
})
public class TestScenario
    extends ModelItem
{

    @XmlElement(required = true)
    protected String beforeRunScript;
    @XmlElement(required = true)
    protected String afterRunScript;
    @XmlAttribute(name = "runType")
    protected TestSuiteRunTypes runType;
    @XmlAttribute(name = "abortOnError")
    protected Boolean abortOnError;
    @XmlAttribute(name = "failOnErrors")
    protected Boolean failOnErrors;
    @XmlAttribute(name = "timeout")
    protected Long timeout;

    /**
     * Gets the value of the beforeRunScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeforeRunScript() {
        return beforeRunScript;
    }

    /**
     * Sets the value of the beforeRunScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeforeRunScript(String value) {
        this.beforeRunScript = value;
    }

    /**
     * Gets the value of the afterRunScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterRunScript() {
        return afterRunScript;
    }

    /**
     * Sets the value of the afterRunScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterRunScript(String value) {
        this.afterRunScript = value;
    }

    /**
     * Gets the value of the runType property.
     * 
     * @return
     *     possible object is
     *     {@link TestSuiteRunTypes }
     *     
     */
    public TestSuiteRunTypes getRunType() {
        return runType;
    }

    /**
     * Sets the value of the runType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestSuiteRunTypes }
     *     
     */
    public void setRunType(TestSuiteRunTypes value) {
        this.runType = value;
    }

    /**
     * Gets the value of the abortOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbortOnError() {
        return abortOnError;
    }

    /**
     * Sets the value of the abortOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbortOnError(Boolean value) {
        this.abortOnError = value;
    }

    /**
     * Gets the value of the failOnErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailOnErrors() {
        return failOnErrors;
    }

    /**
     * Sets the value of the failOnErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailOnErrors(Boolean value) {
        this.failOnErrors = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeout(Long value) {
        this.timeout = value;
    }

}
