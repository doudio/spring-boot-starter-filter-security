package com.doudio.annotatio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: doudio
 * @date: 2021-01-14 12:03
 * @description: CES
 * C = @EnableCorsFilter
 * E = @EnableEscapeHtml4Filter
 * S = @EnableSpaceFilter
 **/
@EnableCorsFilter
@EnableSpaceFilter
@EnableEscapeHtml4Filter
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableSecurityCESFilter {
}
