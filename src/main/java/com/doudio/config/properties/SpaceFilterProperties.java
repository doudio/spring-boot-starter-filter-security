package com.doudio.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Set;

/**
 * @author: quwenlei
 * @date: 2021-01-14 11:54
 * @description:
 **/
@Data
@ConfigurationProperties("doudio.filter.space")
public class SpaceFilterProperties {

    /**
     * 排除
     */
    private Set<String> excludeUrl;

}
