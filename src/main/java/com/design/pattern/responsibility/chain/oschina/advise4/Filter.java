package com.design.pattern.responsibility.chain.oschina.advise4;

public interface Filter {
    // 在接口中添加 FileterChain , 因为只有这样才能把链条握在每一个过滤器手中，有了链条，就可以控制
    void doFilter(Request request, Response response, FilterChain chain);
}
