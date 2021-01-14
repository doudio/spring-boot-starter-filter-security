package com.doudio.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: quwenlei
 * @date: 2021-01-14 11:54
 * @description:
 **/
@Data
@ConfigurationProperties("doudio.filter.xss")
public class XssFilterProperties {
}
