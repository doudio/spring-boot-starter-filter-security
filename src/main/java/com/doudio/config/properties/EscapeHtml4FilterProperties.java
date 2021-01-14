package com.doudio.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: doudio
 * @date: 2021-01-14 12:03
 * @description: 特殊字符过滤配置
 **/
@Data
@ConfigurationProperties("doudio.filter.escape")
public class EscapeHtml4FilterProperties extends FilterProperties {
}
