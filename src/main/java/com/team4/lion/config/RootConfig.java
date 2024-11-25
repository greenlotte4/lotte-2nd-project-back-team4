package com.team4.lion.config;

import com.team4.lion.dto.UserDTO;
import com.team4.lion.entity.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);

        // 수동 매핑 규칙 추가
        modelMapper.typeMap(UserDTO.class, User.class).addMappings(mapper ->
                mapper.map(UserDTO::getPass, User::setPasswordHash)
        );

        return modelMapper;
    }

}