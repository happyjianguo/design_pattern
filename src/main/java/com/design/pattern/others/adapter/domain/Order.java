package com.design.pattern.others.adapter.domain;

import com.design.pattern.others.adapter.dto.BaseDto;

public class Order extends BaseDto {

    private static final long serialVersionUID = 1L;

    private String orderNo;

    private String tradeType;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
    
    

}
