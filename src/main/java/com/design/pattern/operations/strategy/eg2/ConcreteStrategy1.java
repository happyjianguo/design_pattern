package com.design.pattern.operations.strategy.eg2;

public class ConcreteStrategy1 extends AbstractStrategy {
    @Override
    public void algorithm(Context context) {
        System.out.println("----------------我是策略一算法----------------");
    }
}
