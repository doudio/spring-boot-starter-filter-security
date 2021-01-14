package com.doudio.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: doudio
 * @date: 2021-01-14 11:54
 * @description:
 **/
@Data
@ConfigurationProperties("doudio.filter.cors")
public class CorsFilterProperties {

    private HashMap<String, String> headerMap;

    public CorsFilterProperties() {
        headerMap.put("Access-Control-Allow-Origin", "*");
        headerMap.put("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
        headerMap.put("Access-Control-Max-Age", "3600");
        headerMap.put("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, Content-Type, X-Forwarded-For, User-Agent, Authorization, serviceid, newUser, isProprietary");
        headerMap.put("Access-Control-Expose-Headers", "Authorization, serviceid, newUser, isProprietary");
    }

}
