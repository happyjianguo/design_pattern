package com.design.pattern.responsibility.proxy.dynamic.ex2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler {
    
    private Object target;
    
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces() , this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before proxy......");
        
        Object result = method.invoke(target, args);
        
        System.out.println("after proxy.......");
        
        return result;
    }

}
