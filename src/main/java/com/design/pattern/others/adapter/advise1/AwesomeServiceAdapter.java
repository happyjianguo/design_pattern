package com.design.pattern.others.adapter.advise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class AwesomeServiceAdapter  implements ApplicationContextAware{

    private ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    
    /**
     * 获取母实子虚入账并核销bean
     */
    public AbstractAwesomeService getSupportTractorInAndCheckBean(String param1, String param2) {

        String trustBank = supportBank(param1,param2);

        Map<String, AbstractAwesomeService> map = applicationContext.getBeansOfType(AbstractAwesomeService.class);

        List<AbstractAwesomeService> beanList = new ArrayList<AbstractAwesomeService>(map.values());

        for (AbstractAwesomeService bean : beanList) {
            if (bean.support(trustBank)) {
                return bean;
            }
        }
        return null;
    }
    
    private String supportBank(String param1, String param2) {
        return param1 + param2;
    }

}
