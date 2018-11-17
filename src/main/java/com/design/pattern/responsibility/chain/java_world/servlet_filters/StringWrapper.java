package com.design.pattern.responsibility.chain.java_world.servlet_filters;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class StringWrapper extends HttpServletResponseWrapper {
    StringWriter writer = new StringWriter();

    public StringWrapper(HttpServletResponse response) {
        super(response);
    }

    public PrintWriter getWriter() {
        return new PrintWriter(writer);
    }

    public String toString() {
        return writer.toString();
    }
}
