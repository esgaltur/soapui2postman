package cz.esgaltur.soapui2postman.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import cz.esgaltur.soapui2postman.configuration.SoapUi2PostmanConfig;
import cz.esgaltur.soapui2postman.mappers.RestServiceToCollectionMapper;
import cz.esgaltur.soapui2postman.postman.Collection;
import cz.esgaltur.soapui2postman.unmarshaller.SoapUIUnmarshaller;
import cz.esgaltur.soapui2postman.validation.PostmanCollectionValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = {
        "soapui2postman.filename=src/test/resources/TestProject-soapui-project.xml",
        "soapui2postman.outdir=target/test-output/"
})
class SoapUIToPostmanIntegrationTest {

    @Autowired
    private RestServiceToCollectionMapper restServiceToCollectionMapper;

    @Autowired
    private SoapUi2PostmanConfig config;

    @Autowired
    private PostmanCollectionValidator validator;

    @TempDir
    Path tempDir;

    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() throws IOException {
        // Create test resources directory if it doesn't exist
        Path testResourcesDir = Paths.get("src/test/resources");
        if (!Files.exists(testResourcesDir)) {
            Files.createDirectories(testResourcesDir);
        }

        // Copy the test SoapUI project file to the test resources directory if it doesn't exist
        Path sourceFile = Paths.get("TestProject-soapui-project.xml");
        Path targetFile = testResourcesDir.resolve("TestProject-soapui-project.xml");
        if (!Files.exists(targetFile) && Files.exists(sourceFile)) {
            Files.copy(sourceFile, targetFile);
        }

        // Create the output directory
        Files.createDirectories(Paths.get("target/test-output"));
    }

    @Test
    void testFullConversionProcess() throws Exception {
        // Arrange
        assertNotNull(config, "Config should not be null");
        assertNotNull(restServiceToCollectionMapper, "Mapper should not be null");

        File inputFile = new File(config.getFileName());
        assertTrue(inputFile.exists(), "Input file should exist: " + inputFile.getAbsolutePath());

        // Act
        SoapUIUnmarshaller unmarshaller = new SoapUIUnmarshaller(restServiceToCollectionMapper, config, validator);

        // Assert
        File outputDir = new File(config.getOutDir());
        assertTrue(outputDir.exists(), "Output directory should exist");

        // Find the generated file
        File[] files = outputDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".json"));
        assertNotNull(files, "Output files should not be null");
        assertTrue(files.length > 0, "At least one output file should be generated");

        // Verify the content of the generated file
        File outputFile = files[0];
        Collection collection = objectMapper.readValue(outputFile, Collection.class);
        assertNotNull(collection, "Collection should not be null");
        assertNotNull(collection.getInfo(), "Collection info should not be null");
        assertNotNull(collection.getItem(), "Collection items should not be null");
        assertFalse(collection.getItem().isEmpty(), "Collection should have at least one item");
    }
}
