package com.doudio.annotatio;

import com.doudio.config.CorsFilterConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: doudio
 * @date: 2021-01-14 12:03
 * @description: 开启跨域过滤器 单个请求测试 @CrossOrigin
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({CorsFilterConfiguration.class})
public @interface EnableCorsFilter {
}
