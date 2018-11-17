package com.design.pattern.responsibility.chain.wiki.sub;

import com.design.pattern.responsibility.chain.wiki.abs.PurchasePower;

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
