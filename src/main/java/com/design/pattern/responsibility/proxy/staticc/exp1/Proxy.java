package com.design.pattern.responsibility.proxy.staticc.exp1;

public class Proxy implements Subject {
    
    private Subject subject;
    
    public Proxy(Subject subject) {
        this.subject = subject;
    }


    @Override
    public void operate() {
        System.out.println("before operate......");
        
        subject.operate();
        
        System.out.println("after operate......");

    }

}
