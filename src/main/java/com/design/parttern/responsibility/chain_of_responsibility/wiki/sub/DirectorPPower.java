package com.design.parttern.responsibility.chain_of_responsibility.wiki.sub;

import com.design.parttern.responsibility.chain_of_responsibility.wiki.abs.PurchasePower;

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
