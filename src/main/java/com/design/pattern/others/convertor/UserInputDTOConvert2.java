package com.design.pattern.others.convertor;

import org.springframework.beans.BeanUtils;

import com.design.pattern.others.convertor.domain.User;
import com.design.pattern.others.convertor.dto.UserInputDTO;

public class UserInputDTOConvert2 extends Converter<UserInputDTO, User> {

    @Override
    protected User doForward(UserInputDTO userInputDTO) {
        User user = new User();
        BeanUtils.copyProperties(userInputDTO, user);
        return user;
    }

    @Override
    protected UserInputDTO doBackward(User user) {
        UserInputDTO userInputDTO = new UserInputDTO();
        BeanUtils.copyProperties(user, userInputDTO);
        return userInputDTO;

    }

    @Override
    public User apply(UserInputDTO input) {
        // TODO Auto-generated method stub
        return null;
    }

}
