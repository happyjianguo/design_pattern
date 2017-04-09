package responsibility.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RocketImpl extends UnicastRemoteObject implements Rocket {
    private static final long serialVersionUID = 1L;

    protected double price;
    
    protected double apogee;
    
    protected RocketImpl() throws RemoteException {
        super();
    }

    public RocketImpl(double price, double apogee) throws RemoteException {
        this.price = price;
        this.apogee = apogee;
    }

    @Override
    public void boost(double factor) throws RemoteException {
        apogee *= factor;
        
    }

    @Override
    public double getApogee() throws RemoteException {
        return apogee;
    }

    @Override
    public double getPrice() throws RemoteException {
        return price;
    }
    
   
}
