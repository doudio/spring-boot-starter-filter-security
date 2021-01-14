package com.example.web.filter;

import com.example.config.properties.XssFilterProperties;
import com.example.web.filter.wrapper.SpaceHttpServletRequestWrapper;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: quwenlei
 * @date: 2021-01-14 11:57
 * @description:
 **/
@Slf4j
public class CharacterSetFilter extends HttpFilter {

    private XssFilterProperties xssFilterProperties;

    public CharacterSetFilter setXssFilterProperties(XssFilterProperties xssFilterProperties) {
        this.xssFilterProperties = xssFilterProperties;
        return this;
    }

    @Override
    public void init(FilterConfig filterConfig) {
        log.info("-------------------- 字符过滤器启动 --------------------");
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(new SpaceHttpServletRequestWrapper(request), response);
    }

    public void destroy() {
        log.info("-------------------- 字符过滤器停止 --------------------");
    }

}
