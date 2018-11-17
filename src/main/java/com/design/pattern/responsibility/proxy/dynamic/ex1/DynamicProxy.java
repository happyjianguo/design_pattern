package com.design.pattern.responsibility.proxy.dynamic.ex1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    // 目标对象（需要被代理的对象）
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 执行代理对象的所有方法时都会被替换成执行如下的invoke方法
     * proxy: 指代我们所代理的那个真实对象
     * method:　　指代的是我们所要调用真实对象的某个方法的Method对象
     * args:　　指代的是调用真实对象某个方法时接受的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before rent house");
        System.out.println("Method:" + method);

        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象 关联的handler对象的invoke方法来进行调用
        Object result = method.invoke(target, args);

        // 在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after rent house");

        return result;
    }

}
