package com.design.pattern.responsibility.chain_of_responsibility.wiki.sub;

import com.design.pattern.responsibility.chain_of_responsibility.wiki.abs.PurchasePower;

public class VicePresidentPPower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE * 40;

    }

    @Override
    protected String getRole() {
        return "Vice President";
    }

}
