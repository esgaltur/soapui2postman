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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OAuth2Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OAuth2Profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientSecret" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authorizationURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessTokenURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="redirectURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessTokenPosition" type="{http://eviware.com/soapui/config}AccessTokenPosition"/>
 *         &lt;element name="oAuth2Flow" type="{http://eviware.com/soapui/config}OAuth2Flow"/>
 *         &lt;element name="refreshAccessTokenMethod" type="{http://eviware.com/soapui/config}RefreshAccessTokenMethod"/>
 *         &lt;element name="refreshToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessTokenStatus" type="{http://eviware.com/soapui/config}AccessTokenStatus"/>
 *         &lt;element name="accessTokenStartingStatus" type="{http://eviware.com/soapui/config}AccessTokenStatus"/>
 *         &lt;element name="accessTokenExpirationTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="accessTokenIssuedTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="javaScripts" type="{http://eviware.com/soapui/config}StringList"/>
 *         &lt;element name="manualAccessTokenExpirationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useManualAccessTokenExpirationTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="manualAccessTokenExpirationTimeUnit" type="{http://eviware.com/soapui/config}TimeUnit"/>
 *         &lt;element name="resourceOwnerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceOwnerPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAuth2Profile", propOrder = {
    "name",
    "clientID",
    "clientSecret",
    "authorizationURI",
    "accessTokenURI",
    "redirectURI",
    "accessToken",
    "accessTokenPosition",
    "oAuth2Flow",
    "refreshAccessTokenMethod",
    "refreshToken",
    "scope",
    "accessTokenStatus",
    "accessTokenStartingStatus",
    "accessTokenExpirationTime",
    "accessTokenIssuedTime",
    "javaScripts",
    "manualAccessTokenExpirationTime",
    "useManualAccessTokenExpirationTime",
    "manualAccessTokenExpirationTimeUnit",
    "resourceOwnerName",
    "resourceOwnerPassword"
})
public class OAuth2Profile {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String clientID;
    @XmlElement(required = true)
    protected String clientSecret;
    @XmlElement(required = true)
    protected String authorizationURI;
    @XmlElement(required = true)
    protected String accessTokenURI;
    @XmlElement(required = true)
    protected String redirectURI;
    @XmlElement(required = true)
    protected String accessToken;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccessTokenPosition accessTokenPosition;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OAuth2Flow oAuth2Flow;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RefreshAccessTokenMethod refreshAccessTokenMethod;
    @XmlElement(required = true)
    protected String refreshToken;
    @XmlElement(required = true)
    protected String scope;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccessTokenStatus accessTokenStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccessTokenStatus accessTokenStartingStatus;
    protected long accessTokenExpirationTime;
    protected long accessTokenIssuedTime;
    @XmlElement(required = true)
    protected StringList javaScripts;
    protected String manualAccessTokenExpirationTime;
    protected boolean useManualAccessTokenExpirationTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TimeUnit manualAccessTokenExpirationTimeUnit;
    @XmlElement(required = true)
    protected String resourceOwnerName;
    @XmlElement(required = true)
    protected String resourceOwnerPassword;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the clientSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Sets the value of the clientSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecret(String value) {
        this.clientSecret = value;
    }

    /**
     * Gets the value of the authorizationURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationURI() {
        return authorizationURI;
    }

    /**
     * Sets the value of the authorizationURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationURI(String value) {
        this.authorizationURI = value;
    }

    /**
     * Gets the value of the accessTokenURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessTokenURI() {
        return accessTokenURI;
    }

    /**
     * Sets the value of the accessTokenURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessTokenURI(String value) {
        this.accessTokenURI = value;
    }

    /**
     * Gets the value of the redirectURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectURI() {
        return redirectURI;
    }

    /**
     * Sets the value of the redirectURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectURI(String value) {
        this.redirectURI = value;
    }

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the accessTokenPosition property.
     * 
     * @return
     *     possible object is
     *     {@link AccessTokenPosition }
     *     
     */
    public AccessTokenPosition getAccessTokenPosition() {
        return accessTokenPosition;
    }

    /**
     * Sets the value of the accessTokenPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessTokenPosition }
     *     
     */
    public void setAccessTokenPosition(AccessTokenPosition value) {
        this.accessTokenPosition = value;
    }

    /**
     * Gets the value of the oAuth2Flow property.
     * 
     * @return
     *     possible object is
     *     {@link OAuth2Flow }
     *     
     */
    public OAuth2Flow getOAuth2Flow() {
        return oAuth2Flow;
    }

    /**
     * Sets the value of the oAuth2Flow property.
     * 
     * @param value
     *     allowed object is
     *     {@link OAuth2Flow }
     *     
     */
    public void setOAuth2Flow(OAuth2Flow value) {
        this.oAuth2Flow = value;
    }

    /**
     * Gets the value of the refreshAccessTokenMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshAccessTokenMethod }
     *     
     */
    public RefreshAccessTokenMethod getRefreshAccessTokenMethod() {
        return refreshAccessTokenMethod;
    }

    /**
     * Sets the value of the refreshAccessTokenMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshAccessTokenMethod }
     *     
     */
    public void setRefreshAccessTokenMethod(RefreshAccessTokenMethod value) {
        this.refreshAccessTokenMethod = value;
    }

    /**
     * Gets the value of the refreshToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Sets the value of the refreshToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshToken(String value) {
        this.refreshToken = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the accessTokenStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccessTokenStatus }
     *     
     */
    public AccessTokenStatus getAccessTokenStatus() {
        return accessTokenStatus;
    }

    /**
     * Sets the value of the accessTokenStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessTokenStatus }
     *     
     */
    public void setAccessTokenStatus(AccessTokenStatus value) {
        this.accessTokenStatus = value;
    }

    /**
     * Gets the value of the accessTokenStartingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccessTokenStatus }
     *     
     */
    public AccessTokenStatus getAccessTokenStartingStatus() {
        return accessTokenStartingStatus;
    }

    /**
     * Sets the value of the accessTokenStartingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessTokenStatus }
     *     
     */
    public void setAccessTokenStartingStatus(AccessTokenStatus value) {
        this.accessTokenStartingStatus = value;
    }

    /**
     * Gets the value of the accessTokenExpirationTime property.
     * 
     */
    public long getAccessTokenExpirationTime() {
        return accessTokenExpirationTime;
    }

    /**
     * Sets the value of the accessTokenExpirationTime property.
     * 
     */
    public void setAccessTokenExpirationTime(long value) {
        this.accessTokenExpirationTime = value;
    }

    /**
     * Gets the value of the accessTokenIssuedTime property.
     * 
     */
    public long getAccessTokenIssuedTime() {
        return accessTokenIssuedTime;
    }

    /**
     * Sets the value of the accessTokenIssuedTime property.
     * 
     */
    public void setAccessTokenIssuedTime(long value) {
        this.accessTokenIssuedTime = value;
    }

    /**
     * Gets the value of the javaScripts property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getJavaScripts() {
        return javaScripts;
    }

    /**
     * Sets the value of the javaScripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setJavaScripts(StringList value) {
        this.javaScripts = value;
    }

    /**
     * Gets the value of the manualAccessTokenExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualAccessTokenExpirationTime() {
        return manualAccessTokenExpirationTime;
    }

    /**
     * Sets the value of the manualAccessTokenExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualAccessTokenExpirationTime(String value) {
        this.manualAccessTokenExpirationTime = value;
    }

    /**
     * Gets the value of the useManualAccessTokenExpirationTime property.
     * 
     */
    public boolean isUseManualAccessTokenExpirationTime() {
        return useManualAccessTokenExpirationTime;
    }

    /**
     * Sets the value of the useManualAccessTokenExpirationTime property.
     * 
     */
    public void setUseManualAccessTokenExpirationTime(boolean value) {
        this.useManualAccessTokenExpirationTime = value;
    }

    /**
     * Gets the value of the manualAccessTokenExpirationTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit }
     *     
     */
    public TimeUnit getManualAccessTokenExpirationTimeUnit() {
        return manualAccessTokenExpirationTimeUnit;
    }

    /**
     * Sets the value of the manualAccessTokenExpirationTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit }
     *     
     */
    public void setManualAccessTokenExpirationTimeUnit(TimeUnit value) {
        this.manualAccessTokenExpirationTimeUnit = value;
    }

    /**
     * Gets the value of the resourceOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceOwnerName() {
        return resourceOwnerName;
    }

    /**
     * Sets the value of the resourceOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceOwnerName(String value) {
        this.resourceOwnerName = value;
    }

    /**
     * Gets the value of the resourceOwnerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceOwnerPassword() {
        return resourceOwnerPassword;
    }

    /**
     * Sets the value of the resourceOwnerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceOwnerPassword(String value) {
        this.resourceOwnerPassword = value;
    }

}
