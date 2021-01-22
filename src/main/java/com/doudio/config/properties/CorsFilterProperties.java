package com.doudio.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: doudio
 * @date: 2021-01-14 11:54
 * @description: 跨域过滤器配置
 *
 * https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy
 *
 * https://developer.mozilla.org/zh-cn/docs/Web/HTTP/Headers/Content-Security-Policy
 *
 * 一、点击劫持
 * X-FRAME-OPTIONS
 *
 * X-FRAME-OPTIONS是一个 HTTP 响应头，在现代浏览器有一个很好的支持。这个 HTTP 响应头 就是为了防御用 iframe 嵌套的点击劫持攻击。
 *
 * 该响应头有三个值可选，分别是
 *
 * DENY，表示页面不允许通过 iframe 的方式展示
 * SAMEORIGIN，表示页面可以在相同域名下通过 iframe 的方式展示
 * ALLOW-FROM，表示页面可以在指定来源的 iframe 中展示
 *
 **/
@Data
@ConfigurationProperties("doudio.filter.cors")
public class CorsFilterProperties {

    private Map<String, String> headerMap = new HashMap<String, String>();

    public CorsFilterProperties() {
        headerMap.put("Access-Control-Allow-Origin", "*");
        headerMap.put("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
        headerMap.put("Access-Control-Max-Age", "3600");
        headerMap.put("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, Content-Type, X-Forwarded-For, User-Agent, Authorization, serviceid, newUser, isProprietary");
        headerMap.put("Access-Control-Expose-Headers", "Authorization, serviceid, newUser, isProprietary");
    }

}
