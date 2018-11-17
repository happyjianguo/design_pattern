package com.design.pattern.others.dispatcher.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.design.pattern.others.dispatcher.ConvertorDispatcher;
import com.design.pattern.others.dispatcher.domain.Order;
import com.design.pattern.others.dispatcher.enums.TradeType;

public class TestDispatcher {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("application.xml");
        
        ConvertorDispatcher dispatcher = context.getBean(ConvertorDispatcher.class);
        
        List<Order> orders = new ArrayList<Order>();
        
        Order order1 = new Order();
        order1.setOrderNo("PAY000000001");
        order1.setTradeType(TradeType.ONLINE_RECON_CONFIRM.name());
        
        Order order2 = new Order();
        order2.setOrderNo("PAY000000002");
        order2.setTradeType(TradeType.ONLINE_RECON_CONFIRM_DETAIL.name());
        
        orders.add(order1);
        orders.add(order2);
        
        for(Order order : orders) {
            dispatcher.dispatch(order.getTradeType()).convert(order);
        }
        context.close();
    }
}
