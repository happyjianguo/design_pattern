package com.design.pattern.others.convertor;

import org.springframework.beans.BeanUtils;

import com.design.pattern.others.convertor.domain.User;
import com.design.pattern.others.convertor.dto.UserInputDTO;

public class UserInputDTOConvert implements DTOConvert<UserInputDTO,User>{

    @Override
    public User convert(UserInputDTO userInputDTO) {
        User user = new User();
        BeanUtils.copyProperties(userInputDTO,user);
        return user;
    }

}
