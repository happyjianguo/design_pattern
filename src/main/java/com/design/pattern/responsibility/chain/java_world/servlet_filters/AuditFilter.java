package com.design.pattern.responsibility.chain.java_world.servlet_filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuditFilter implements Filter{
    private ServletContext app = null;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        app = filterConfig.getServletContext();
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //app.log(((HttpServletRequest)request).getServletPath());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

}
