package com.design.parttern.responsibility.chain_of_responsibility.oschina.advise3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filters = new ArrayList<Filter>();

    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }

    /**
               * 定义一个过滤器链类，这这个类中定义添加过滤器的方法，以及运行整个链条上的所有过滤器的方法，并且返回结果。
     * 
     * @param str
     * @return
     */
    public String doFilter(String str) {
        if (null != str && !("").equals(str.trim())) {
            for (Filter f : filters) {
                str = f.doFilter(str);
            }
        }
        return str;
    }
}
