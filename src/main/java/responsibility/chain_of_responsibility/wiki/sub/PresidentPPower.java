package responsibility.chain_of_responsibility.wiki.sub;

import responsibility.chain_of_responsibility.wiki.abs.PurchasePower;

public class PresidentPPower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE * 60;
    }

    @Override
    protected String getRole() {
        return "President";
    }

}
