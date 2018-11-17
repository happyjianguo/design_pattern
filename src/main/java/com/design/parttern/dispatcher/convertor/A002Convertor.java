package com.design.parttern.dispatcher.convertor;

import org.springframework.stereotype.Service;

import com.design.parttern.dispatcher.order.Order;

@Service
public class A002Convertor implements IConvertor {
   
    @Override
    public void convert(Order order) {
        System.out.println("A002 do convert thing....");
    }

}
