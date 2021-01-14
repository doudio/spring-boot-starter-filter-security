package com.doudio.config.properties;

import lombok.Data;

import java.util.List;

/**
 * @date: 2021-01-14 14:48
 * @description: 过滤器通用配置
 **/
@Data
public class FilterProperties {

    /**
     * 排除
     */
    private List<String> excludeUrl;

}
