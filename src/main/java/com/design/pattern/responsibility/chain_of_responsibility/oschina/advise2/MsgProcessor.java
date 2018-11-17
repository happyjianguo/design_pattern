package com.design.pattern.responsibility.chain_of_responsibility.oschina.advise2;

import java.util.ArrayList;
import java.util.List;

public class MsgProcessor {

    private List<Filter> filters = new ArrayList<Filter>();

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 这样还是不够灵活，直接在 MsgProcessor 类中添加一个数组来保存过滤器，然后在 processor 方法中进行多次调用：
     */
    public MsgProcessor(List<Filter> filters) {
        this.filters = filters;
    }

    /**
               *   这样调整后，所有的过滤器都起作用了，添加起来更加灵活一些，并且过滤器的执行顺序也是可控的
               *   当多个过滤器组合在一起，就形成了过滤器链，到这里，责任链有点雏形了。
     */
    public String process() {
        if (null != msg && !("").equals(msg.trim())) {
            for (Filter f : filters) {
                msg = f.doFilter(msg);
            }
        }
        return msg;
    }
}
