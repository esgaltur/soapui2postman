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

@Mapper(componentModel = "spring",
        uses = {EntryToHeaderMapper.class,
                EntryToQueryMapper.class,StringToUrl.class})
public interface RestRequestToRequestMapper {

    /**
     * @param request
     * @return
     */
    List<Request> restRequestListToItemList(List<RestRequest> request);

    /**
     * @param request
     * @return
     */
    List<Object> restRequestListToItemListObject(List<RestRequest> request);


    @Mapping(target = "auth.type", constant = "BASIC")
    @Mapping(source = "originalUri", target = "url")
    @Mapping(source = "request", target = "body")
    @Mapping(source = "parameters.entry", target = "url.query")
    Request restRequestToRequset(RestRequest request);



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
