package com.doudio.web.filter;

import com.doudio.config.properties.SpaceFilterProperties;
import com.doudio.web.filter.wrapper.SpaceHttpServletRequestWrapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

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
 * @description: 空格字符过滤器
 **/
@Slf4j
public class SpaceFilter extends HttpFilter {

    private SpaceFilterProperties spaceFilterProperties;
    private Set<String> excludeUrl;

    public SpaceFilter() {
    }

    public SpaceFilter(SpaceFilterProperties spaceFilterProperties) {
        this.spaceFilterProperties = spaceFilterProperties;
        this.excludeUrl = spaceFilterProperties.getExcludeUrl();
    }

    @Override
    public void init(FilterConfig filterConfig) {
        log.info("-------------------- 空格字符过滤器启动 --------------------");
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String path = request.getRequestURI().substring(request.getContextPath().length()).replaceAll("[/]+$", "");
        boolean exclude = true;

        if (ObjectUtils.isEmpty(excludeUrl)) {
            exclude = !excludeUrl.contains(path);
        }

        if (exclude) {
            chain.doFilter(new SpaceHttpServletRequestWrapper(request), response);
        } else {
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
        log.info("-------------------- 空格字符过滤器停止 --------------------");
    }

}
