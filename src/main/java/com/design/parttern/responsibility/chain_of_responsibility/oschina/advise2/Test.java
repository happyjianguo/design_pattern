package com.design.parttern.responsibility.chain_of_responsibility.oschina.advise2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String str = "你好:)，这句话中有敏感词汇，需要处理。<script>，敏感！";
        System.out.println(str);

        List<Filter> filters = new ArrayList<Filter>();
        filters.add(new HtmlFilter());
        filters.add(new SensitivityFilter());
        filters.add(new SmileFilter());

        MsgProcessor pro = new MsgProcessor(filters);
        pro.setMsg(str);
        str = pro.process();

        System.out.println(str);
    }
}
