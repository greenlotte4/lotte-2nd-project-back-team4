package com.team4.lion.service;

import com.team4.lion.dto.UserDTO;
import com.team4.lion.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void saveUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUser_id(1L);
        userDTO.setUsername("test");
        userDTO.setPass("1234");
        userDTO.setEmail("test@test.com");
        userDTO.setPlan_id(1L);

        userService.saveUser(userDTO);
    }
}