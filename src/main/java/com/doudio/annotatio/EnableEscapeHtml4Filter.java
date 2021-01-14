package com.doudio.annotatio;

import com.doudio.config.EscapeHtml4FilterConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: doudio
 * @date: 2021-01-14 12:03
 * @description: 开启转义 Html4
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({EscapeHtml4FilterConfiguration.class})
public @interface EnableEscapeHtml4Filter {
}
