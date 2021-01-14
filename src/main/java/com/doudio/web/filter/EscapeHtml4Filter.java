package com.doudio.web.filter;

import com.doudio.config.properties.EscapeHtml4FilterProperties;
import com.doudio.util.ValUtil;
import com.doudio.web.filter.wrapper.EscapeHtml4HttpServletRequestWrapper;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

/**
 * @author: doudio
 * @date: 2021-01-14 11:57
 * @description: 特殊字符过滤器
 **/
@Slf4j
public class EscapeHtml4Filter extends HttpFilter {

    private EscapeHtml4FilterProperties escapeHtml4FilterProperties;
    private Set<String> excludeUrl;

    public EscapeHtml4Filter() {
    }

    public EscapeHtml4Filter(EscapeHtml4FilterProperties escapeHtml4FilterProperties) {
        this.escapeHtml4FilterProperties = escapeHtml4FilterProperties;
        this.excludeUrl = escapeHtml4FilterProperties.getExcludeUrl();
    }

    @Override
    public void init(FilterConfig filterConfig) {
        log.info("Special character filter init");
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String path = request.getRequestURI().substring(request.getContextPath().length()).replaceAll("[/]+$", "");
        boolean exclude = true;

        if (ValUtil.isNotEmpty(excludeUrl)) {
            exclude = !excludeUrl.contains(path);
        }

        if (exclude) {
            chain.doFilter(new EscapeHtml4HttpServletRequestWrapper(request), response);
        } else {
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
        log.info("Special character filter destroy");
    }

}
