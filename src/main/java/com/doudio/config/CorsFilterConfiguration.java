package com.doudio.config;

import com.doudio.config.properties.CorsFilterProperties;
import com.doudio.web.filter.CorsFilter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author: doudio
 * @date: 2021-01-14 11:51
 * @description: 加载跨域过滤器
 **/
@Data
@ConditionalOnClass
@EnableConfigurationProperties(CorsFilterProperties.class)
public class CorsFilterConfiguration {

    @Autowired
    private CorsFilterProperties corsFilterProperties;

    @Bean
    public CorsFilter corsFilter() {
        return new CorsFilter(corsFilterProperties);
    }

}
