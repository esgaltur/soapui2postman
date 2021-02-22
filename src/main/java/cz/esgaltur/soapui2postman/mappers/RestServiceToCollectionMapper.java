package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.generated.soapui.RestResource;
import cz.esgaltur.soapui2postman.generated.soapui.RestService;
import cz.esgaltur.soapui2postman.postman.Collection;
import cz.esgaltur.soapui2postman.postman.Info;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static cz.esgaltur.soapui2postman.constants.SoaupUi2PostmanConstants.POSTMAN_SCHEMA_VERSION;

@Mapper(componentModel = "spring")
@Slf4j
public abstract class RestServiceToCollectionMapper {
    /**
     * Method to Item
     */
    @Autowired
    RestResourceToItem restResourceToItem;


    public Collection restServiceToCollection(RestService restService) throws MalformedURLException {
        Collection collection = new Collection();
        Info info = new Info();
        info.setSchema(POSTMAN_SCHEMA_VERSION);
        info.setPostmanId(UUID.randomUUID().toString());
        info.setName(restService.getName());
        collection.setInfo(info);
        List<Object> list = new ArrayList<>();
        for (RestResource restResource : restService.getResource()) {
            list.addAll(restResourceToItem.resourcesToItems(restService.getEndpoints(),restResource));
        }
        collection.setItem(list);
        return collection;
    }


}
