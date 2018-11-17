package com.design.parttern.responsibility.chain_of_responsibility.oschina.advise2;

public class SmileFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace(":)", "^V^");
    }

}
