package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.CompressedString;
import cz.esgaltur.soapui2postman.generated.soapui.RestRequest;
import cz.esgaltur.soapui2postman.postman.*;
import org.apache.commons.lang.StringUtils;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.net.MalformedURLException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * MapStruct mapper for converting SoapUI RestRequest objects to Postman Request objects.
 * This interface defines the mapping methods between the two models.
 */
@Mapper(componentModel = "spring",
        uses = {EntryToHeaderMapper.class,
                EntryToQueryMapper.class,StringToUrl.class})
public interface RestRequestToRequestMapper {

    /**
     * Converts a list of SoapUI RestRequest objects to a list of Postman Request objects.
     * 
     * @param request List of SoapUI RestRequest objects to convert
     * @return List of converted Postman Request objects
     */
    List<Request> restRequestListToItemList(List<RestRequest> request);

    /**
     * Converts a list of SoapUI RestRequest objects to a list of Postman Item objects.
     * 
     * @param request List of SoapUI RestRequest objects to convert
     * @return List of converted Postman Item objects
     */
    List<Item> restRequestListToItemListObject(List<RestRequest> request);


    /**
     * Converts a single SoapUI RestRequest object to a Postman Request object.
     * Maps various properties from the SoapUI model to the Postman model.
     * 
     * @param request SoapUI RestRequest object to convert
     * @return Converted Postman Request object
     */
    @Mapping(target = "auth.type", constant = "BASIC")
    @Mapping(source = "originalUri", target = "url")
    @Mapping(source = "request", target = "body")
    @Mapping(source = "parameters.entry", target = "url.query")
    Request restRequestToRequest(RestRequest request);



    /**
     * Custom mapping method to create a Postman Body object from a SoapUI CompressedString.
     * Sets up the body with RAW mode and JSON language options.
     * 
     * @param request SoapUI CompressedString containing the request body
     * @return Postman Body object with the appropriate settings
     */
    default Body mapBody(CompressedString request) {
        if (request == null) {
            return new Body();
        }
        Body body = new Body();
        body.setMode(Body.Mode.RAW);
        body.setRaw(request.getValue());
        Options options = new Options();
        Map<String, String> stringObjectMap = new HashMap<>();
        stringObjectMap.put("language", "json");
        options.setAdditionalProperty("raw", stringObjectMap);
        body.setOptions(options);
        return body;
    }

    /**
     * After mapping method to set up basic authentication if credentials are present in the SoapUI request.
     * This method is called automatically by MapStruct after the main mapping is complete.
     * 
     * @param request The target Postman Request object
     * @param restRequest The source SoapUI RestRequest object
     */
    @AfterMapping
    default void after(@MappingTarget Request request, RestRequest restRequest) {
        if (restRequest.getCredentials() != null) {
            request.getAuth().getBasic().add(new AuthAttribute());
            request.getAuth().getBasic().add(new AuthAttribute());
            //-----------------------------------//
            request.getAuth().getBasic().get(0).setType("string");
            request.getAuth().getBasic().get(0).setKey("username");
            request.getAuth().getBasic().get(0).setValue(restRequest.getCredentials().getUsername());
            //-----------------------------------//
            request.getAuth().getBasic().get(1).setType("string");
            request.getAuth().getBasic().get(1).setKey("password");
            request.getAuth().getBasic().get(1).setValue(restRequest.getCredentials().getPassword());
        }
    }
}
