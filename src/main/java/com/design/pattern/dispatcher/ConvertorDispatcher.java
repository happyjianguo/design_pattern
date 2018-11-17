package com.design.pattern.dispatcher;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.design.pattern.dispatcher.convertor.A001Convertor;
import com.design.pattern.dispatcher.convertor.A002Convertor;
import com.design.pattern.dispatcher.convertor.IConvertor;
import com.design.pattern.dispatcher.enums.TradeType;
import com.design.pattern.dispatcher.exception.DesignPatternException;

@Service
public class ConvertorDispatcher {

    @Resource
    private A001Convertor a001Convertor;

    @Resource
    private A002Convertor a002Convertor;

    private Map<String, IConvertor> convertorMap = new HashMap<String, IConvertor>();

    @PostConstruct
    public void setupConvertorMap() {
        convertorMap.put(TradeType.ONLINE_RECON_CONFIRM.name(), a001Convertor);
        convertorMap.put(TradeType.ONLINE_RECON_CONFIRM_DETAIL.name(), a002Convertor);
    }

    /**
                * 按交易类型, 分派给具体的转换器
     */
    public IConvertor dispatch(String tradeType) {
        IConvertor convertor = convertorMap.get(tradeType);

        if (convertor == null) {
            throw new DesignPatternException("cannot found convertor for tradeType:" + tradeType);
        }

        return convertor;
    }

}
