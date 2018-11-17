package com.design.pattern.responsibility.chain_of_responsibility.oschina.advise2;

public class HtmlFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace("<", "{").replace(">", "}");
    }

}
