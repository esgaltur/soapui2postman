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
 * <p>Java class for Project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Project">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}ModelItem">
 *       &lt;sequence>
 *         &lt;element name="interface" type="{http://eviware.com/soapui/config}Interface" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testSuite" type="{http://eviware.com/soapui/config}TestSuite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mockService" type="{http://eviware.com/soapui/config}MockService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="restMockService" type="{http://eviware.com/soapui/config}RESTMockService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endpointStrategy" type="{http://eviware.com/soapui/config}EndpointStrategy" minOccurs="0"/>
 *         &lt;element name="requirements" type="{http://eviware.com/soapui/config}RequirementsType" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://eviware.com/soapui/config}PropertiesType" minOccurs="0"/>
 *         &lt;element name="afterLoadScript" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="beforeSaveScript" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="encryptedContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="encryptedContentAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wssContainer" type="{http://eviware.com/soapui/config}WssContainer" minOccurs="0"/>
 *         &lt;element name="databaseConnectionContainer" type="{http://eviware.com/soapui/config}DatabaseConnectionContainer" minOccurs="0"/>
 *         &lt;element name="oAuth2ProfileContainer" type="{http://eviware.com/soapui/config}OAuth2ProfileContainer" minOccurs="0"/>
 *         &lt;element name="oAuth1ProfileContainer" type="{http://eviware.com/soapui/config}OAuth1ProfileContainer" minOccurs="0"/>
 *         &lt;element name="reporting" type="{http://eviware.com/soapui/config}ReportingType" minOccurs="0"/>
 *         &lt;element name="reportScript" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="beforeRunScript" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="afterRunScript" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="eventHandlers" type="{http://eviware.com/soapui/config}EventHandlerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sensitiveInformation" type="{http://eviware.com/soapui/config}SensitiveInformation" minOccurs="0"/>
 *         &lt;element name="environment" type="{http://eviware.com/soapui/config}Environment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="updated" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="soapui-version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resourceRoot" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultScriptLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="abortOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="runType" type="{http://eviware.com/soapui/config}TestSuiteRunTypes" />
 *       &lt;attribute name="scriptLibrary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="activeEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
    "_interface",
    "testSuite",
    "mockService",
    "restMockService",
    "endpointStrategy",
    "requirements",
    "properties",
    "afterLoadScript",
    "beforeSaveScript",
    "encryptedContent",
    "encryptedContentAlgorithm",
    "wssContainer",
    "databaseConnectionContainer",
    "oAuth2ProfileContainer",
    "oAuth1ProfileContainer",
    "reporting",
    "reportScript",
    "beforeRunScript",
    "afterRunScript",
    "eventHandlers",
    "sensitiveInformation",
    "environment"
})
public class Project
    extends ModelItem
{

    @XmlElement(name = "interface")
    protected List<Interface> _interface;
    protected List<TestSuite> testSuite;
    protected List<MockService> mockService;
    protected List<RESTMockService> restMockService;
    protected EndpointStrategy endpointStrategy;
    protected RequirementsType requirements;
    protected PropertiesType properties;
    protected Script afterLoadScript;
    protected Script beforeSaveScript;
    protected byte[] encryptedContent;
    protected String encryptedContentAlgorithm;
    protected WssContainer wssContainer;
    protected DatabaseConnectionContainer databaseConnectionContainer;
    protected OAuth2ProfileContainer oAuth2ProfileContainer;
    protected OAuth1ProfileContainer oAuth1ProfileContainer;
    protected ReportingType reporting;
    protected Script reportScript;
    protected Script beforeRunScript;
    protected Script afterRunScript;
    protected List<EventHandlerType> eventHandlers;
    protected SensitiveInformation sensitiveInformation;
    protected List<Environment> environment;
    @XmlAttribute(name = "updated")
    protected String updated;
    @XmlAttribute(name = "soapui-version")
    protected String soapuiVersion;
    @XmlAttribute(name = "resourceRoot")
    protected String resourceRoot;
    @XmlAttribute(name = "defaultScriptLanguage")
    protected String defaultScriptLanguage;
    @XmlAttribute(name = "abortOnError")
    protected Boolean abortOnError;
    @XmlAttribute(name = "timeout")
    protected Long timeout;
    @XmlAttribute(name = "runType")
    protected TestSuiteRunTypes runType;
    @XmlAttribute(name = "scriptLibrary")
    protected String scriptLibrary;
    @XmlAttribute(name = "activeEnvironment")
    protected String activeEnvironment;

    /**
     * Gets the value of the interface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interface }
     * 
     * 
     */
    public List<Interface> getInterface() {
        if (_interface == null) {
            _interface = new ArrayList<Interface>();
        }
        return this._interface;
    }

    /**
     * Gets the value of the testSuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSuite }
     * 
     * 
     */
    public List<TestSuite> getTestSuite() {
        if (testSuite == null) {
            testSuite = new ArrayList<TestSuite>();
        }
        return this.testSuite;
    }

    /**
     * Gets the value of the mockService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mockService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMockService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MockService }
     * 
     * 
     */
    public List<MockService> getMockService() {
        if (mockService == null) {
            mockService = new ArrayList<MockService>();
        }
        return this.mockService;
    }

    /**
     * Gets the value of the restMockService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restMockService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestMockService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESTMockService }
     * 
     * 
     */
    public List<RESTMockService> getRestMockService() {
        if (restMockService == null) {
            restMockService = new ArrayList<RESTMockService>();
        }
        return this.restMockService;
    }

    /**
     * Gets the value of the endpointStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointStrategy }
     *     
     */
    public EndpointStrategy getEndpointStrategy() {
        return endpointStrategy;
    }

    /**
     * Sets the value of the endpointStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointStrategy }
     *     
     */
    public void setEndpointStrategy(EndpointStrategy value) {
        this.endpointStrategy = value;
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementsType }
     *     
     */
    public RequirementsType getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementsType }
     *     
     */
    public void setRequirements(RequirementsType value) {
        this.requirements = value;
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
     * Gets the value of the afterLoadScript property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getAfterLoadScript() {
        return afterLoadScript;
    }

    /**
     * Sets the value of the afterLoadScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setAfterLoadScript(Script value) {
        this.afterLoadScript = value;
    }

    /**
     * Gets the value of the beforeSaveScript property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getBeforeSaveScript() {
        return beforeSaveScript;
    }

    /**
     * Sets the value of the beforeSaveScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setBeforeSaveScript(Script value) {
        this.beforeSaveScript = value;
    }

    /**
     * Gets the value of the encryptedContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptedContent() {
        return encryptedContent;
    }

    /**
     * Sets the value of the encryptedContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptedContent(byte[] value) {
        this.encryptedContent = value;
    }

    /**
     * Gets the value of the encryptedContentAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedContentAlgorithm() {
        return encryptedContentAlgorithm;
    }

    /**
     * Sets the value of the encryptedContentAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedContentAlgorithm(String value) {
        this.encryptedContentAlgorithm = value;
    }

    /**
     * Gets the value of the wssContainer property.
     * 
     * @return
     *     possible object is
     *     {@link WssContainer }
     *     
     */
    public WssContainer getWssContainer() {
        return wssContainer;
    }

    /**
     * Sets the value of the wssContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link WssContainer }
     *     
     */
    public void setWssContainer(WssContainer value) {
        this.wssContainer = value;
    }

    /**
     * Gets the value of the databaseConnectionContainer property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseConnectionContainer }
     *     
     */
    public DatabaseConnectionContainer getDatabaseConnectionContainer() {
        return databaseConnectionContainer;
    }

    /**
     * Sets the value of the databaseConnectionContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseConnectionContainer }
     *     
     */
    public void setDatabaseConnectionContainer(DatabaseConnectionContainer value) {
        this.databaseConnectionContainer = value;
    }

    /**
     * Gets the value of the oAuth2ProfileContainer property.
     * 
     * @return
     *     possible object is
     *     {@link OAuth2ProfileContainer }
     *     
     */
    public OAuth2ProfileContainer getOAuth2ProfileContainer() {
        return oAuth2ProfileContainer;
    }

    /**
     * Sets the value of the oAuth2ProfileContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OAuth2ProfileContainer }
     *     
     */
    public void setOAuth2ProfileContainer(OAuth2ProfileContainer value) {
        this.oAuth2ProfileContainer = value;
    }

    /**
     * Gets the value of the oAuth1ProfileContainer property.
     * 
     * @return
     *     possible object is
     *     {@link OAuth1ProfileContainer }
     *     
     */
    public OAuth1ProfileContainer getOAuth1ProfileContainer() {
        return oAuth1ProfileContainer;
    }

    /**
     * Sets the value of the oAuth1ProfileContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OAuth1ProfileContainer }
     *     
     */
    public void setOAuth1ProfileContainer(OAuth1ProfileContainer value) {
        this.oAuth1ProfileContainer = value;
    }

    /**
     * Gets the value of the reporting property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingType }
     *     
     */
    public ReportingType getReporting() {
        return reporting;
    }

    /**
     * Sets the value of the reporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingType }
     *     
     */
    public void setReporting(ReportingType value) {
        this.reporting = value;
    }

    /**
     * Gets the value of the reportScript property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getReportScript() {
        return reportScript;
    }

    /**
     * Sets the value of the reportScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setReportScript(Script value) {
        this.reportScript = value;
    }

    /**
     * Gets the value of the beforeRunScript property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getBeforeRunScript() {
        return beforeRunScript;
    }

    /**
     * Sets the value of the beforeRunScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setBeforeRunScript(Script value) {
        this.beforeRunScript = value;
    }

    /**
     * Gets the value of the afterRunScript property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getAfterRunScript() {
        return afterRunScript;
    }

    /**
     * Sets the value of the afterRunScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setAfterRunScript(Script value) {
        this.afterRunScript = value;
    }

    /**
     * Gets the value of the eventHandlers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventHandlers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventHandlers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventHandlerType }
     * 
     * 
     */
    public List<EventHandlerType> getEventHandlers() {
        if (eventHandlers == null) {
            eventHandlers = new ArrayList<EventHandlerType>();
        }
        return this.eventHandlers;
    }

    /**
     * Gets the value of the sensitiveInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SensitiveInformation }
     *     
     */
    public SensitiveInformation getSensitiveInformation() {
        return sensitiveInformation;
    }

    /**
     * Sets the value of the sensitiveInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitiveInformation }
     *     
     */
    public void setSensitiveInformation(SensitiveInformation value) {
        this.sensitiveInformation = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Environment }
     * 
     * 
     */
    public List<Environment> getEnvironment() {
        if (environment == null) {
            environment = new ArrayList<Environment>();
        }
        return this.environment;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the soapuiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoapuiVersion() {
        return soapuiVersion;
    }

    /**
     * Sets the value of the soapuiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoapuiVersion(String value) {
        this.soapuiVersion = value;
    }

    /**
     * Gets the value of the resourceRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceRoot() {
        return resourceRoot;
    }

    /**
     * Sets the value of the resourceRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceRoot(String value) {
        this.resourceRoot = value;
    }

    /**
     * Gets the value of the defaultScriptLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultScriptLanguage() {
        return defaultScriptLanguage;
    }

    /**
     * Sets the value of the defaultScriptLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultScriptLanguage(String value) {
        this.defaultScriptLanguage = value;
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
     * Gets the value of the scriptLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptLibrary() {
        return scriptLibrary;
    }

    /**
     * Sets the value of the scriptLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptLibrary(String value) {
        this.scriptLibrary = value;
    }

    /**
     * Gets the value of the activeEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveEnvironment() {
        return activeEnvironment;
    }

    /**
     * Sets the value of the activeEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveEnvironment(String value) {
        this.activeEnvironment = value;
    }

}
