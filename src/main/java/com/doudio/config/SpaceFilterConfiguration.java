package com.doudio.config;

import com.doudio.config.properties.SpaceFilterProperties;
import com.doudio.web.filter.SpaceFilter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @author: quwenlei
 * @date: 2021-01-14 11:51
 * @description:
 **/
@Data
@ConditionalOnClass
public class SpaceFilterConfiguration {

    @Autowired
    private SpaceFilterProperties spaceFilterProperties;

    @Bean
    public SpaceFilter spaceFilter() {
        return new SpaceFilter(spaceFilterProperties);
    }

}
