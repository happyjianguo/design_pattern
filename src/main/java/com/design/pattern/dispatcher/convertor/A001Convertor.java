package com.design.pattern.dispatcher.convertor;

import org.springframework.stereotype.Service;

import com.design.pattern.dispatcher.order.Order;

@Service
public class A001Convertor implements IConvertor {
    
    @Override
    public void convert(Order order) {
        System.out.println("A001 do convert thing....");
    }
}
