package com.design.pattern.responsibility.proxy.rmi;

import java.rmi.Naming;

public class RegisterRocket {
    public static void main(String[] args) {
        try{
            Rocket biggie = new RocketImpl(29.95, 820);
            Naming.bind("rmi://localhost:5000/Biggie", biggie);
            System.out.println("server registered biggie");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
