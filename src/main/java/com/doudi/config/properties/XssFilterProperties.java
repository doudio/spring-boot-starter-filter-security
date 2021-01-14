package com.doudi.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: quwenlei
 * @date: 2021-01-14 11:54
 * @description:
 **/
@Data
@ConfigurationProperties("github.filter.xss")
public class XssFilterProperties {
}