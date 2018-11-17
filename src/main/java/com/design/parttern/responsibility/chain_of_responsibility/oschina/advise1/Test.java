package com.design.parttern.responsibility.chain_of_responsibility.oschina.advise1;

public class Test {
    public static void main(String[] args) {
        String str = "你好:)，这句话中有敏感词汇，需要处理。<script>，敏感！";
        System.out.println(str);
        
        MsgProcessor processor = new MsgProcessor();
        processor.setMsg(str);
        str = processor.process();
        
        System.out.println(str);
    }
}
