package com.design.pattern.responsibility.chain.oschina.advise3;

public class HtmlFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace("<", "{").replace(">", "}");
    }

}
