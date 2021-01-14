package com.doudio.config;

import com.doudio.config.properties.EscapeHtml4FilterProperties;
import com.doudio.web.filter.EscapeHtml4Filter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author: doudio
 * @date: 2021-01-14 11:51
 * @description:
 **/
@Data
@ConditionalOnClass
@EnableConfigurationProperties(EscapeHtml4FilterProperties.class)
public class EscapeHtml4FilterConfiguration {

    @Autowired
    private EscapeHtml4FilterProperties escapeHtml4FilterProperties;

    @Bean
    public EscapeHtml4Filter xssFilter() {
        return new EscapeHtml4Filter(escapeHtml4FilterProperties);
    }

}
