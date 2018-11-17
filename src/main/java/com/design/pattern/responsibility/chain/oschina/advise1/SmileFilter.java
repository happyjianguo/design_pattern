package com.design.pattern.responsibility.chain.oschina.advise1;

public class SmileFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace(":)", "^V^");
    }

}
