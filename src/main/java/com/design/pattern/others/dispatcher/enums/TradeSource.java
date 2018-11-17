package com.design.pattern.others.dispatcher.enums;

public enum TradeSource {

    CLEARING_RECON_PULL("清结算对账");

    TradeSource(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }

    public static String getText(String type) {
        try {
            return valueOf(type).getText();
        } catch (Exception e) {
            return type;
        }
    }
}
