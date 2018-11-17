package com.design.pattern.others.adapter.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class AwesomeParam extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 外部订单号
     */
    @NotEmpty
    protected String outTradeNo;

    /**
     * 外部支付号
     */
    @NotEmpty
    protected String outPayNo;

    /**
     * 交易时间
     */
    @NotNull
    protected Date tradeTime;

    /**
     * 交易金额
     */
    @NotNull
    protected Long amount;

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutPayNo() {
        return outPayNo;
    }

    public void setOutPayNo(String outPayNo) {
        this.outPayNo = outPayNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

}
