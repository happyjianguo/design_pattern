package com.design.pattern.others.dispatcher.convertor;

import org.springframework.stereotype.Service;

import com.design.pattern.others.dispatcher.domain.Order;

@Service
public class A001Convertor implements IConvertor {
    
    @Override
    public void convert(Order order) {
        System.out.println("A001 do convert thing....");
    }
}
