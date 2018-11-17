package com.design.pattern.others.adapter.advise1;

import org.springframework.stereotype.Service;

import com.design.pattern.others.adapter.domain.Order;
import com.design.pattern.others.adapter.dto.AwesomeParam;

@Service
public abstract class AbstractAwesomeService {

    // 数据落地
    public abstract Order landBankDiffData(AwesomeParam param, Order order);

    /**
     * 数据落地
     */
    public void landData(AwesomeParam param) {

        // 1. 校验
        Order order = verifyParam(param);

        // 2.数据落地.不同银行不同落地方式
        try {
            order = landBankDiffData(param, order);
        } catch (Exception e) {
            // 幂等异常处理
            throw e;
        }

        // 3.落地后处理
        this.updateOrderStatus(param, order);
    }

    // 更新交易单状态
    private void updateOrderStatus(AwesomeParam param, Order order) {
        System.out.println("update order status...");
    }

    // 校验参数
    private Order verifyParam(AwesomeParam param) {
        System.out.println("verify param....");

        return new Order();
    }

    // 适配器
    public abstract boolean support(String bank);
}
