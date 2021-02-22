package cz.esgaltur.soapui2postman.mappers;


import cz.esgaltur.soapui2postman.generated.soapui.Endpoint;
import cz.esgaltur.soapui2postman.generated.soapui.Endpoints;
import cz.esgaltur.soapui2postman.generated.soapui.RestParameter;
import cz.esgaltur.soapui2postman.generated.soapui.RestResource;
import cz.esgaltur.soapui2postman.postman.Header;
import cz.esgaltur.soapui2postman.postman.Item;
import cz.esgaltur.soapui2postman.postman.Url;
import cz.esgaltur.soapui2postman.postman.Variable;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
@Slf4j
public abstract class RestResourceToItem {


    @Autowired
    private RestMethodToItemMapper restMethodToItemMapper;

    @Autowired
    private ParameterToHeader parameterToHeader;
    @Autowired
    private ParameterToQuery parameterToQuery;
    @Autowired
    private ParameterToVariable parameterToVariable;
    @Autowired
    private StringToUrl stringToUrl;


    List<Object> resourcesToItems(Endpoints endpoints, RestResource restResource) throws MalformedURLException {

        List<Url> list = new ArrayList<>();
        for (String endpoint : endpoints.getEndpoint()) {
            String fullUrlAddress = endpoint.concat(restResource.getPath());
            list.add(stringToUrl.rawStringToUrl(fullUrlAddress));
        }
        List<Item> items = restMethodToItemMapper.restMethodToItem(list, restResource.getMethod());
        List<Item> itemsResult = new ArrayList<>();
            for (Item item : items) {

                for (RestParameter par : restResource.getParameters().getParameter()) {
                    if (par.getStyle().equals("HEADER")) {
                        Header header = parameterToHeader.parameterToHeader(par);
                        if (StringUtils.isBlank(header.getValue())) {
                            header.setValue("<EmptyValue>");
                        }
                        item.getRequest().getHeader().add(header);
                    }
                    if (par.getStyle().equals("QUERY")) {
                        item.getRequest().getUrl().getQuery().add(parameterToQuery.parameterToQuery(par));
                    }
                    if (par.getStyle().equals("TEMPLATE")) {
                        Variable variable = parameterToVariable.parameterToVariable(par);
                        log.info(variable.getValue().toString());
                        if (StringUtils.isBlank((String) variable.getValue())) {
                            variable.setValue("<EmptyValue>");
                        }
                        item.getVariable().add(parameterToVariable.parameterToVariable(par));
                    }
                }
                itemsResult.add(item);
            }
        return new ArrayList<>(itemsResult);
    }
}
