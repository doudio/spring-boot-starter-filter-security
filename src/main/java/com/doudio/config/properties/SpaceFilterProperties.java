package com.doudio.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: doudio
 * @date: 2021-01-14 11:54
 * @description:
 **/
@Data
@ConfigurationProperties("doudio.filter.space")
public class SpaceFilterProperties extends FilterProperties {

}
