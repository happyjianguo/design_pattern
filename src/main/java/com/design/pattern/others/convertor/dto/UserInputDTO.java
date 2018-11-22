package com.design.pattern.others.convertor.dto;

import org.springframework.beans.BeanUtils;

import com.design.pattern.others.convertor.DTOConvert;
import com.design.pattern.others.convertor.domain.User;

public class UserInputDTO extends BaseDto {

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

    public User convertToUser() {
        UserInputDTOConvert userInputDTOConvert = new UserInputDTOConvert();
        User convert = userInputDTOConvert.convert(this);
        return convert;
    }

    private static class UserInputDTOConvert implements DTOConvert<UserInputDTO, User> {
        @Override
        public User convert(UserInputDTO userInputDTO) {
            User user = new User();
            BeanUtils.copyProperties(userInputDTO, user);
            return user;
        }
    }
}
