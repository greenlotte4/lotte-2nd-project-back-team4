package com.team4.lion.service;

import com.team4.lion.dto.UserDTO;
import com.team4.lion.entity.User;
import com.team4.lion.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public void saveUser(UserDTO userDTO){
        User user = modelMapper.map(userDTO, User.class);
        userRepository.save(user);
    }


}
