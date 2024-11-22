package com.team4.lion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "user")
public class User {

    @Id
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
