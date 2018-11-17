package com.design.parttern.responsibility.proxy.dynamic.ex1;

public class SubjectImpl implements ISubject {

    public void rent() {
        System.out.println("I want to rent my house");
    }

    public void hello(String str) {
        System.out.println("hello: " + str);
    }

}
