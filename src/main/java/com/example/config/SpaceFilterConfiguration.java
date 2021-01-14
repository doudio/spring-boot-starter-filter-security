package com.example.config;

import com.example.config.properties.XssFilterProperties;
import com.example.web.filter.CharacterSetFilter;
import com.example.web.filter.SpaceFilter;
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
public class SpaceFilterConfiguration {

    @Bean
    public SpaceFilter spaceFilter() {
        return new SpaceFilter();
    }

}
