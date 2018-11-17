package com.design.pattern.responsibility.chain_of_responsibility.oschina.advise3;

public class SensitivityFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace("敏感", "");
    }

}
