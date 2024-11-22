package com.team4.lion.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long user_id;
    private String pass;
    private String username;
    private String email;

    private Long plan_id;
    private String addr1;
    private String addr2;
    private String zipcode;
    private String status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
