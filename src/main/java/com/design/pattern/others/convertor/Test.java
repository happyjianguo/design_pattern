package com.design.pattern.others.convertor;

import com.design.pattern.others.convertor.domain.User;
import com.design.pattern.others.convertor.dto.UserInputDTO;

public class Test {
    public static void main(String[] args) {
        UserInputDTO userInputDTO = new UserInputDTO();
        userInputDTO.setAge(11);
        userInputDTO.setUserName("liujianyong");
        
        User user = new UserInputDTOConvert().convert(userInputDTO);
        System.out.println(user);
    }
    
    
}
