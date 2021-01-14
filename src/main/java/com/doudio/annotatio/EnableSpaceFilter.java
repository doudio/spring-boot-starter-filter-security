package com.doudio.annotatio;

import com.doudio.config.SpaceFilterConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: doudio
 * @date: 2021-01-14 12:03
 * @description: 开启前后空格过滤
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({SpaceFilterConfiguration.class})
public @interface EnableSpaceFilter {
}
