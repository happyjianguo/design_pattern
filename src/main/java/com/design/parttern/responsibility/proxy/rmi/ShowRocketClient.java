package com.design.parttern.responsibility.proxy.rmi;

import java.rmi.Naming;

public class ShowRocketClient {

    /**
     * 1、rmic responsibility.proxy.rmi.RocketImpl
     * 2、rmiregistry 5000
     * 3、运行 ShowRocketClient
     * 
     * @param args
     */
    public static void main(String[] args) {
        Object obj;
        try {
            obj = Naming.lookup("rmi://localhost:5000/Biggie");
            Rocket biggie = (Rocket) obj;
            System.out.println("apogee:" + biggie.getApogee());
        } catch (Exception e) {
            System.out.println("Exception while looking up a rocket!");
            e.printStackTrace();
        }

    }

}
