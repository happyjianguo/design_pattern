package com.design.pattern.responsibility.chain.wiki.sub;

import com.design.pattern.responsibility.chain.wiki.abs.PurchasePower;

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
