package com.doudio.web.filter;

import com.doudio.config.properties.CorsFilterProperties;
import com.doudio.util.ValUtil;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author: doudio
 * @date: 2021-01-14 11:57
 * @description: 跨域过滤器-处理跨域请求示例
 **/
@Slf4j
public class CorsFilter extends HttpFilter {

    private CorsFilterProperties corsFilterProperties;
    private Map<String, String> headerMap;

    public CorsFilter() {
    }

    public CorsFilter(CorsFilterProperties corsFilterProperties) {
        this.corsFilterProperties = corsFilterProperties;
        this.headerMap = corsFilterProperties.getHeaderMap();
    }

    @Override
    public void init(FilterConfig filterConfig) {
        log.info("Cross domain filter init");
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (ValUtil.isNotEmpty(headerMap)) {
            for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                response.setHeader(entry.getKey(), entry.getValue());
            }
        }
        chain.doFilter(request, response);
    }

    public void destroy() {
        log.info("Cross domain filter destroy");
    }

}
