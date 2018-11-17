package com.design.pattern.responsibility.chain_of_responsibility.oschina.bad;

public class Test {
    public static void main(String[] args) {
        String str = "你好:)，这句话中有敏感词汇，需要处理。<script>，敏感！";
        System.out.println(str);
        MsgProcessor pro = new MsgProcessor();
        pro.setMsg(str);
        str = pro.processor();
        System.out.println(str);
    }
}
