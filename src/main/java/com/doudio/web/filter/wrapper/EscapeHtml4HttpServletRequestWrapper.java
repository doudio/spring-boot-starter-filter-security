package com.doudio.web.filter.wrapper;

import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @author: doudio
 * @date: 2021-01-14 12:03
 * @description: 转义html4 基于 org.apache.commons.text.StringEscapeUtils
 **/
public class EscapeHtml4HttpServletRequestWrapper extends HttpServletRequestWrapper {

    public EscapeHtml4HttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String[] getParameterValues(String parameter) {
        String[] values = super.getParameterValues(parameter);
        if (values == null) {
            return new String[0];
        }
        int count = values.length;
        String[] encodedValues = new String[count];
        for (int i = 0; i < count; i++) {
            encodedValues[i] = StringEscapeUtils.escapeHtml4(values[i]);
        }
        return encodedValues;
    }

    @Override
    public String getParameter(String parameter) {
        String value = super.getParameter(parameter);
        if (value == null) {
            return null;
        }
        return StringEscapeUtils.escapeHtml4(value);
    }

}