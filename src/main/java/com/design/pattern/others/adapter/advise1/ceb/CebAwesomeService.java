package com.design.pattern.others.adapter.advise1.ceb;

import org.springframework.stereotype.Service;

import com.design.pattern.others.adapter.advise1.AbstractAwesomeService;
import com.design.pattern.others.adapter.domain.Order;
import com.design.pattern.others.adapter.dto.AwesomeParam;
import com.design.pattern.others.adapter.enums.SupportBank;

@Service
public class CebAwesomeService extends AbstractAwesomeService {

    @Override
    public Order landBankDiffData(AwesomeParam param, Order order) {
        
        System.out.println("ceb landing data...");
        
        return order;
    }
    

    @Override
    public boolean support(String bank) {
        if (SupportBank.CEB.name().equals(bank)) {
            return true;
        }
        return false;
    }


}
