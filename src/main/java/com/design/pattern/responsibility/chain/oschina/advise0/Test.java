package com.design.pattern.responsibility.chain.oschina.advise0;

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
