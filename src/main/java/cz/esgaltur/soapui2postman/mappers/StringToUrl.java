package cz.esgaltur.soapui2postman.mappers;

import cz.esgaltur.soapui2postman.postman.Url;
import org.apache.commons.lang.StringUtils;
import org.mapstruct.Mapper;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public abstract class StringToUrl {


    Url rawStringToUrl(String value) throws MalformedURLException {
        if (StringUtils.isBlank(value)) {
            return new Url();
        }
        java.net.URL netUrl = new java.net.URL(value);
        Url url = new Url();
        url.setPort(netUrl.getPort() > 0 ? String.valueOf(netUrl.getPort()) : "");
        url.setQuery(new ArrayList<>());
        url.setHost(netUrl.getHost());
        url.setProtocol(netUrl.getProtocol());
        url.setRaw(value);
        url.setVariable(new ArrayList<>());
        List<String> paths = Arrays.stream(netUrl.getPath().split("/"))
                .filter(s -> !s.isBlank()).map(s -> {
                    if (s.matches("\\{.*\\}")) {
                        return s.replace("{", ":").replace("}", "");
                    } else return s;
                })
                .collect(Collectors.toList());

        url.setPath(paths);
        return url;
    }
}
