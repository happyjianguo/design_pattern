package com.design.parttern.responsibility.chain_of_responsibility.oschina.advise1;

public class HtmlFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace("<", "{").replace(">", "}");
    }

}
