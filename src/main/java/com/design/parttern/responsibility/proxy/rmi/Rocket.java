package com.design.parttern.responsibility.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Rocket extends Remote{
    void boost(double factor) throws RemoteException;
    
    /**
     * Apogee 最高点； 远地点； 最远点；
     * @return
     * @throws RemoteException
     */
    double getApogee() throws RemoteException;
    
    double getPrice() throws RemoteException;
    
}
