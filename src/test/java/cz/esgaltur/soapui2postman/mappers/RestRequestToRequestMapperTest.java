package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.CompressedString;
import cz.esgaltur.soapui2postman.generated.soapui.Credentials;
import cz.esgaltur.soapui2postman.generated.soapui.RestRequest;
import cz.esgaltur.soapui2postman.postman.Auth;
import cz.esgaltur.soapui2postman.postman.AuthAttribute;
import cz.esgaltur.soapui2postman.postman.Body;
import cz.esgaltur.soapui2postman.postman.Request;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RestRequestToRequestMapperTest {

    @Spy
    private RestRequestToRequestMapperImpl mapper;

    @Mock
    private EntryToHeaderMapper entryToHeaderMapper;

    @Mock
    private EntryToQueryMapper entryToQueryMapper;

    @Mock
    private StringToUrl stringToUrl;

    @Test
    void testMapBody_WithNullRequest_ReturnsEmptyBody() {
        // Act
        Body result = mapper.mapBody(null);

        // Assert
        assertNotNull(result);
        assertNull(result.getRaw());
        assertNull(result.getOptions());
    }

    @Test
    void testMapBody_WithValidRequest_ReturnsBodyWithRawAndOptions() {
        // Arrange
        CompressedString compressedString = new CompressedString();
        compressedString.setValue("test body");

        // Act
        Body result = mapper.mapBody(compressedString);

        // Assert
        assertNotNull(result);
        assertEquals("test body", result.getRaw());
        assertEquals(Body.Mode.RAW, result.getMode());
        assertNotNull(result.getOptions());
        assertNotNull(result.getOptions().getAdditionalProperties());
        assertTrue(result.getOptions().getAdditionalProperties().containsKey("raw"));
    }

    @Test
    void testAfter_WithCredentials_SetsBasicAuth() {
        // Arrange
        Request request = new Request();
        Auth auth = new Auth();
        auth.setType(Auth.Type.BASIC);
        request.setAuth(auth);

        RestRequest restRequest = new RestRequest();
        Credentials credentials = new Credentials();
        credentials.setUsername("testUser");
        credentials.setPassword("testPass");
        restRequest.setCredentials(credentials);

        // Act
        mapper.after(request, restRequest);

        // Assert
        assertNotNull(request.getAuth());
        assertNotNull(request.getAuth().getBasic());
        assertEquals(2, request.getAuth().getBasic().size());

        assertEquals("username", request.getAuth().getBasic().get(0).getKey());
        assertEquals("testUser", request.getAuth().getBasic().get(0).getValue());

        assertEquals("password", request.getAuth().getBasic().get(1).getKey());
        assertEquals("testPass", request.getAuth().getBasic().get(1).getValue());
    }

    @Test
    void testAfter_WithoutCredentials_DoesNotSetBasicAuth() {
        // Arrange
        Request request = new Request();
        Auth auth = new Auth();
        auth.setType(Auth.Type.BASIC);
        request.setAuth(auth);

        RestRequest restRequest = new RestRequest();
        restRequest.setCredentials(null);

        // Act
        mapper.after(request, restRequest);

        // Assert
        assertNotNull(request.getAuth());
        assertTrue(request.getAuth().getBasic().isEmpty());
    }
}
