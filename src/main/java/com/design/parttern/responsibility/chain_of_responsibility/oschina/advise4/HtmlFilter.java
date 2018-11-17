package com.design.parttern.responsibility.chain_of_responsibility.oschina.advise4;

public class HtmlFilter implements Filter {

    /**
     * 现在来看，每个过滤器都持有过滤器链，在处理完request后，调用下一个过滤器，由于方法是栈结构，这样就会形成一个过滤器栈，拥有栈的数据结构特点。
     * 这也是为什么Struts在配置多个拦截器的时候，成为拦截器栈的原因。
     * 由于栈的数据特点，就能达到我们想要的特点，按照过滤器的次序，依次处理完request
     * ，然后再反向依次处理response。这就是责任链模式在实际开发中的使用
     */
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String str = request.getRequestStr();
        
        str = str.replace("<", "{").replace(">", "}");
        System.out.println(str);
        
        request.setRequestStr(str);
        
        chain.doFilter(request, response, chain);

        String resStr = response.getResponseStr();

        System.out.println("html");

    }

}
