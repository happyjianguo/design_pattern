package com.design.pattern.responsibility.chain.wiki.sub;

import com.design.pattern.responsibility.chain.wiki.abs.PurchasePower;

public class DirectorPPower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE * 20;
    }

    @Override
    protected String getRole() {
        return "Director";
    }

}
