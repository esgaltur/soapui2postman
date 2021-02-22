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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}ModelItem">
 *       &lt;sequence>
 *         &lt;element name="threadCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sampleInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calculateTPSOnTimePassed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resetStatisticsOnThreadCountChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="historyLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testLimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="limitType" type="{http://eviware.com/soapui/config}LoadTestLimitTypes"/>
 *         &lt;element name="loadStrategy" type="{http://eviware.com/soapui/config}LoadStrategy"/>
 *         &lt;element name="assertion" type="{http://eviware.com/soapui/config}LoadTestAssertion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxAssertionErrors" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statisticsLogFolder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statisticsLogInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logStatisticsOnThreadChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelOnReachedLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelExcessiveThreads" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="strategyInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="setupScript" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="tearDownScript" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="updateStatisticsPerTestStep" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reportScript" type="{http://eviware.com/soapui/config}Script" minOccurs="0"/>
 *         &lt;element name="reportParameters" type="{http://eviware.com/soapui/config}PropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTest", propOrder = {
    "threadCount",
    "startDelay",
    "sampleInterval",
    "calculateTPSOnTimePassed",
    "resetStatisticsOnThreadCountChange",
    "historyLimit",
    "testLimit",
    "limitType",
    "loadStrategy",
    "assertion",
    "maxAssertionErrors",
    "statisticsLogFolder",
    "statisticsLogInterval",
    "logStatisticsOnThreadChange",
    "cancelOnReachedLimit",
    "cancelExcessiveThreads",
    "strategyInterval",
    "setupScript",
    "tearDownScript",
    "updateStatisticsPerTestStep",
    "reportScript",
    "reportParameters"
})
public class LoadTest
    extends ModelItem
{

    @XmlElement(defaultValue = "5")
    protected int threadCount;
    protected int startDelay;
    protected int sampleInterval;
    protected boolean calculateTPSOnTimePassed;
    protected boolean resetStatisticsOnThreadCountChange;
    protected Long historyLimit;
    protected long testLimit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LoadTestLimitTypes limitType;
    @XmlElement(required = true)
    protected LoadStrategy loadStrategy;
    protected List<LoadTestAssertion> assertion;
    protected Long maxAssertionErrors;
    @XmlElement(required = true)
    protected String statisticsLogFolder;
    protected int statisticsLogInterval;
    protected boolean logStatisticsOnThreadChange;
    protected boolean cancelOnReachedLimit;
    protected boolean cancelExcessiveThreads;
    protected int strategyInterval;
    protected Script setupScript;
    protected Script tearDownScript;
    protected boolean updateStatisticsPerTestStep;
    protected Script reportScript;
    protected PropertiesType reportParameters;

    /**
     * Gets the value of the threadCount property.
     * 
     */
    public int getThreadCount() {
        return threadCount;
    }

    /**
     * Sets the value of the threadCount property.
     * 
     */
    public void setThreadCount(int value) {
        this.threadCount = value;
    }

    /**
     * Gets the value of the startDelay property.
     * 
     */
    public int getStartDelay() {
        return startDelay;
    }

    /**
     * Sets the value of the startDelay property.
     * 
     */
    public void setStartDelay(int value) {
        this.startDelay = value;
    }

    /**
     * Gets the value of the sampleInterval property.
     * 
     */
    public int getSampleInterval() {
        return sampleInterval;
    }

    /**
     * Sets the value of the sampleInterval property.
     * 
     */
    public void setSampleInterval(int value) {
        this.sampleInterval = value;
    }

    /**
     * Gets the value of the calculateTPSOnTimePassed property.
     * 
     */
    public boolean isCalculateTPSOnTimePassed() {
        return calculateTPSOnTimePassed;
    }

    /**
     * Sets the value of the calculateTPSOnTimePassed property.
     * 
     */
    public void setCalculateTPSOnTimePassed(boolean value) {
        this.calculateTPSOnTimePassed = value;
    }

    /**
     * Gets the value of the resetStatisticsOnThreadCountChange property.
     * 
     */
    public boolean isResetStatisticsOnThreadCountChange() {
        return resetStatisticsOnThreadCountChange;
    }

    /**
     * Sets the value of the resetStatisticsOnThreadCountChange property.
     * 
     */
    public void setResetStatisticsOnThreadCountChange(boolean value) {
        this.resetStatisticsOnThreadCountChange = value;
    }

    /**
     * Gets the value of the historyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHistoryLimit() {
        return historyLimit;
    }

    /**
     * Sets the value of the historyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHistoryLimit(Long value) {
        this.historyLimit = value;
    }

    /**
     * Gets the value of the testLimit property.
     * 
     */
    public long getTestLimit() {
        return testLimit;
    }

    /**
     * Sets the value of the testLimit property.
     * 
     */
    public void setTestLimit(long value) {
        this.testLimit = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTestLimitTypes }
     *     
     */
    public LoadTestLimitTypes getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTestLimitTypes }
     *     
     */
    public void setLimitType(LoadTestLimitTypes value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the loadStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link LoadStrategy }
     *     
     */
    public LoadStrategy getLoadStrategy() {
        return loadStrategy;
    }

    /**
     * Sets the value of the loadStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadStrategy }
     *     
     */
    public void setLoadStrategy(LoadStrategy value) {
        this.loadStrategy = value;
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
     * {@link LoadTestAssertion }
     * 
     * 
     */
    public List<LoadTestAssertion> getAssertion() {
        if (assertion == null) {
            assertion = new ArrayList<LoadTestAssertion>();
        }
        return this.assertion;
    }

    /**
     * Gets the value of the maxAssertionErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxAssertionErrors() {
        return maxAssertionErrors;
    }

    /**
     * Sets the value of the maxAssertionErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxAssertionErrors(Long value) {
        this.maxAssertionErrors = value;
    }

    /**
     * Gets the value of the statisticsLogFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsLogFolder() {
        return statisticsLogFolder;
    }

    /**
     * Sets the value of the statisticsLogFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsLogFolder(String value) {
        this.statisticsLogFolder = value;
    }

    /**
     * Gets the value of the statisticsLogInterval property.
     * 
     */
    public int getStatisticsLogInterval() {
        return statisticsLogInterval;
    }

    /**
     * Sets the value of the statisticsLogInterval property.
     * 
     */
    public void setStatisticsLogInterval(int value) {
        this.statisticsLogInterval = value;
    }

    /**
     * Gets the value of the logStatisticsOnThreadChange property.
     * 
     */
    public boolean isLogStatisticsOnThreadChange() {
        return logStatisticsOnThreadChange;
    }

    /**
     * Sets the value of the logStatisticsOnThreadChange property.
     * 
     */
    public void setLogStatisticsOnThreadChange(boolean value) {
        this.logStatisticsOnThreadChange = value;
    }

    /**
     * Gets the value of the cancelOnReachedLimit property.
     * 
     */
    public boolean isCancelOnReachedLimit() {
        return cancelOnReachedLimit;
    }

    /**
     * Sets the value of the cancelOnReachedLimit property.
     * 
     */
    public void setCancelOnReachedLimit(boolean value) {
        this.cancelOnReachedLimit = value;
    }

    /**
     * Gets the value of the cancelExcessiveThreads property.
     * 
     */
    public boolean isCancelExcessiveThreads() {
        return cancelExcessiveThreads;
    }

    /**
     * Sets the value of the cancelExcessiveThreads property.
     * 
     */
    public void setCancelExcessiveThreads(boolean value) {
        this.cancelExcessiveThreads = value;
    }

    /**
     * Gets the value of the strategyInterval property.
     * 
     */
    public int getStrategyInterval() {
        return strategyInterval;
    }

    /**
     * Sets the value of the strategyInterval property.
     * 
     */
    public void setStrategyInterval(int value) {
        this.strategyInterval = value;
    }

    /**
     * Gets the value of the setupScript property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getSetupScript() {
        return setupScript;
    }

    /**
     * Sets the value of the setupScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setSetupScript(Script value) {
        this.setupScript = value;
    }

    /**
     * Gets the value of the tearDownScript property.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getTearDownScript() {
        return tearDownScript;
    }

    /**
     * Sets the value of the tearDownScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setTearDownScript(Script value) {
        this.tearDownScript = value;
    }

    /**
     * Gets the value of the updateStatisticsPerTestStep property.
     * 
     */
    public boolean isUpdateStatisticsPerTestStep() {
        return updateStatisticsPerTestStep;
    }

    /**
     * Sets the value of the updateStatisticsPerTestStep property.
     * 
     */
    public void setUpdateStatisticsPerTestStep(boolean value) {
        this.updateStatisticsPerTestStep = value;
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
     * Gets the value of the reportParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getReportParameters() {
        return reportParameters;
    }

    /**
     * Sets the value of the reportParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setReportParameters(PropertiesType value) {
        this.reportParameters = value;
    }

}