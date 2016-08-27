package responsibility.chain_of_responsibility.wiki.sub;

import responsibility.chain_of_responsibility.wiki.abs.PurchasePower;

public class ManagerPPower extends PurchasePower{

    @Override
    protected double getAllowable() {
        return BASE*10;
    }

    @Override
    protected String getRole() {
        return "Manager";
    }

}