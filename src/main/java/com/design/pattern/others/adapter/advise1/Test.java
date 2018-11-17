package com.design.pattern.others.adapter.advise1;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.design.pattern.others.adapter.dto.AwesomeParam;

public class Test {
public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("application.xml");
        
        AwesomeServiceAdapter adapter = context.getBean(AwesomeServiceAdapter.class);
        
        
        AwesomeParam param = new AwesomeParam();
        param.setOutTradeNo("outTradeNo1");
        param.setOutPayNo("outPayNo1");
        param.setTradeTime(new Date());
        param.setAmount(100L);
        
        String param1 = "CI";
        String param2 = "TIC";
        
        // 多银行，不同银行不同处理
        adapter.getSupportTractorInAndCheckBean(param1, param2).landData(param);
        
        context.close();
    }
}
