package com.design.pattern.others.convertor.domain;

import com.design.pattern.others.adapter.dto.BaseDto;

public class User extends BaseDto {

    private static final long serialVersionUID = 1L;
    
    private Integer age;

    private String userName;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
