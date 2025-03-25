package com.example.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor // 모든 필드에 생성자를 자동생성
public class Schedule {

    private Long id;          // 임의의 추가 숫자
    private String name;      // VARCHAR = String
    private String comment;   // VARCHAR = String
    private LocalDateTime createdAt;   // Date = YYYY-MM-DD 의 형태
    private LocalDateTime updatedAt;   // Date = YYYY-MM-DD 시간초.. 의 형태
    private String password;  // VARCHAR = String

    public Schedule (String name, String comment, String password) {

        this.name = name;
        this.comment = comment;
        this.password = password;
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }


    public void updateComment(String comment){
        this.comment = comment;
        this.updatedAt = LocalDateTime.now();
    }

}


