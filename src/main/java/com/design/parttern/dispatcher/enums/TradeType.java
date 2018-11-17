package com.design.parttern.dispatcher.enums;

public enum TradeType {

    ONLINE_RECON_CONFIRM(TradeGroup.RECON, "支付-线上-对账确认", TradeSource.CLEARING_RECON_PULL),
    ONLINE_RECON_CONFIRM_DETAIL(TradeGroup.RECON, "支付-线上-对账确认明细", TradeSource.CLEARING_RECON_PULL);

    TradeType(TradeGroup group, String text, TradeSource source) {
        this.group = group;
        this.text = text;
        this.source = source;
    }

    private TradeGroup group;

    private String text;

    private TradeSource source;

    public TradeGroup getGroup() {
        return group;
    }

    public String getText() {
        return text;
    }

    public TradeSource getSource() {
        return source;
    }
}
