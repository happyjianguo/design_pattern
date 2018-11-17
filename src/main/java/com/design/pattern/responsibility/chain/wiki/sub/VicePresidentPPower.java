package com.design.pattern.responsibility.chain.wiki.sub;

import com.design.pattern.responsibility.chain.wiki.abs.PurchasePower;

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
