package com.doudio.config;

import com.doudio.config.properties.XssFilterProperties;
import com.doudio.web.filter.CharacterSetFilter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author: quwenlei
 * @date: 2021-01-14 11:51
 * @description:
 **/
@Data
@ConditionalOnClass
@EnableConfigurationProperties(XssFilterProperties.class)
public class XssFilterConfiguration {

    @Autowired
    private XssFilterProperties xssFilterProperties;

    @Bean
    public CharacterSetFilter characterSetFilter() {
        return new CharacterSetFilter().setXssFilterProperties(xssFilterProperties);
    }

}
