package com.team4.lion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "plan")
public class Plan {
    @Id
    private Long plan_id;
    private String name;
    private int price;
    private Long drive_capacity; //저장 용량
    private Long max_file_size;
    private int max_projects;
    private int max_collaborators; //초대 가능한 최대 협업자 수
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
