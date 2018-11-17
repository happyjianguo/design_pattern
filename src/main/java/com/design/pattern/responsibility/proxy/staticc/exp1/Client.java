package com.design.pattern.responsibility.proxy.staticc.exp1;

public class Client {

    public static void main(String[] args) {
       
       Subject subject = new RealSubject();
       
       Proxy proxy = new Proxy(subject);
       
       proxy.operate();
       
    }

}
