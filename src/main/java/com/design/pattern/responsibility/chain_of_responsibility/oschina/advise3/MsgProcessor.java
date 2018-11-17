package com.design.pattern.responsibility.chain_of_responsibility.oschina.advise3;

public class MsgProcessor {

    private FilterChain chain;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public FilterChain getChain() {
        return chain;
    }

    public void setChain(FilterChain chain) {
        this.chain = chain;
    }

    public String process() {
        return chain.doFilter(msg);
    }
}
