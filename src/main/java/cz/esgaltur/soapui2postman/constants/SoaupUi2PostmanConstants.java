package cz.esgaltur.soapui2postman.constants;

/**
 * COnstants
 */
public class SoaupUi2PostmanConstants {
    private SoaupUi2PostmanConstants() {
    }

    /**
     * Interface tag in SoapUI schema
     */
    public static final String INTERFACE_TAG_NAME = "{http://eviware.com/soapui/config}interface";
    /**
     * Entry tag name
     */
    public static final String ENTRY_TAG_NAME = "{http://eviware.com/soapui/config}entry";
    /**
     *  Postman schema version, currwently only 2.1 supporting
     */
    public static final String POSTMAN_SCHEMA_VERSION = "https://schema.getpostman.com/json/collection/v2.1.0/collection.json";
}
