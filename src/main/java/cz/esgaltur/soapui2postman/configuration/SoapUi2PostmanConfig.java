package cz.esgaltur.soapui2postman.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "soapui2postman")
@Data
public class SoapUi2PostmanConfig {
    private String fileName;
    private String outDir;
}
