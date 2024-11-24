package com.ecommerce.bookbazar.service.mapper;

import com.ecommerce.bookbazar.model.User;
import com.ecommerce.bookbazar.service.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static User mapToUser(UserDTO userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(user.getLastName());
        user.setEmailId(user.getEmailId());
        user.setMobileNo(userDto.getMobileNo());
        user.setAddress(userDto.getAddress());

        return user;
    }

    public static UserDTO mapToUserDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setMobileNo(user.getMobileNo());
        userDTO.setEmailId(user.getEmailId());
        userDTO.setAddress(user.getAddress());

        return userDTO;
    }
}
