package com.design.pattern.others.dispatcher.enums;

public enum TradeGroup {

    RECHARGE("充值"),

    PAY("支付"),

    REFUND("退款"),

    SETTLE("结算"),

    PAYOUT("出款"),

    RECON("对账"),

    OFFLINE_INCOME("线下进款"),

    BATCH_PAYOUT("批次出款"),

    PRIMARY_TO_PRIMARY("主转主转账"),

    B2E_MANUAL("手工银企"),

    TRANSFER("转账");
    
    
    TradeGroup(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }
}
