package cz.esgaltur.soapui2postman.validation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import cz.esgaltur.soapui2postman.postman.Collection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 * Validator for Postman collections.
 * This class validates Postman collections against the Postman schema.
 */
@Component
@Slf4j
public class PostmanCollectionValidator {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private JsonSchema schema;

    /**
     * Constructor that initializes the validator with the Postman schema.
     */
    public PostmanCollectionValidator() {
        try {
            // Load the Postman schema from the classpath
            InputStream schemaStream = getClass().getResourceAsStream("/schema/collection.schema.json");
            if (schemaStream == null) {
                log.warn("Postman schema not found in classpath, validation will be skipped");
                return;
            }
            
            JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V4);
            schema = factory.getSchema(schemaStream);
            log.info("Postman schema loaded successfully");
        } catch (Exception e) {
            log.error("Error loading Postman schema: {}", e.getMessage());
            log.debug("Stack trace:", e);
        }
    }

    /**
     * Validates a Postman collection against the Postman schema.
     * 
     * @param collection The collection to validate
     * @return A set of validation messages, empty if the collection is valid
     */
    public Set<ValidationMessage> validate(Collection collection) {
        if (schema == null) {
            log.warn("Postman schema not loaded, skipping validation");
            return Set.of();
        }
        
        try {
            JsonNode jsonNode = objectMapper.valueToTree(collection);
            Set<ValidationMessage> validationMessages = schema.validate(jsonNode);
            
            if (validationMessages.isEmpty()) {
                log.info("Collection is valid");
            } else {
                log.warn("Collection validation failed with {} errors", validationMessages.size());
                validationMessages.forEach(message -> log.warn("Validation error: {}", message));
            }
            
            return validationMessages;
        } catch (Exception e) {
            log.error("Error validating collection: {}", e.getMessage());
            log.debug("Stack trace:", e);
            return Set.of();
        }
    }

    /**
     * Validates a Postman collection file against the Postman schema.
     * 
     * @param file The collection file to validate
     * @return A set of validation messages, empty if the collection is valid
     * @throws IOException If there is an error reading the file
     */
    public Set<ValidationMessage> validate(File file) throws IOException {
        if (schema == null) {
            log.warn("Postman schema not loaded, skipping validation");
            return Set.of();
        }
        
        try {
            JsonNode jsonNode = objectMapper.readTree(file);
            Set<ValidationMessage> validationMessages = schema.validate(jsonNode);
            
            if (validationMessages.isEmpty()) {
                log.info("Collection file is valid: {}", file.getAbsolutePath());
            } else {
                log.warn("Collection file validation failed with {} errors: {}", 
                        validationMessages.size(), file.getAbsolutePath());
                validationMessages.forEach(message -> log.warn("Validation error: {}", message));
            }
            
            return validationMessages;
        } catch (Exception e) {
            log.error("Error validating collection file: {}", e.getMessage());
            log.debug("Stack trace:", e);
            return Set.of();
        }
    }
}