package com.design.pattern.responsibility.chain.oschina.advise1;

public class SensitivityFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace("敏感", "");
    }

}
