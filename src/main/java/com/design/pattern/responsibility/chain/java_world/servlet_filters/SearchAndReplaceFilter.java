package com.design.pattern.responsibility.chain.java_world.servlet_filters;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class SearchAndReplaceFilter implements Filter {
    private FilterConfig config;

    public void init(FilterConfig config) {
        this.config = config;
    }

    public FilterConfig getFilterConfig() {
        return config;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
        // wraps (or decorates) the response object with a wrapper (decorator)
        // that stands in for the response.
        StringWrapper wrapper = new StringWrapper((HttpServletResponse) response);
        // SearchAndReplaceFilter.doFilter() calls chain.doFilter() to forward
        // the request,
        // it passes the wrapper instead of the original response
        chain.doFilter(request, wrapper);
        String responseString = wrapper.toString();
        String search = config.getInitParameter("search");
        String replace = config.getInitParameter("replace");
        if (search == null || replace == null)
            return; // Parameters not set properly
        int index = responseString.indexOf(search);
        if (index != -1) {
            String beforeReplace = responseString.substring(0, index);
            String afterReplace = responseString.substring(index + search.length());
            response.getWriter().print(beforeReplace + replace + afterReplace);
        }
    }

    public void destroy() {
        config = null;
    }
}
