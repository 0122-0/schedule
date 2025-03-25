package com.example.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor // 모든 필드에 생성자를 자동생성
public class Schedule {

    private Long id;          // 임의의 추가 숫자
    private String name;      // VARCHAR = String
    private LocalDate dating;      // Date = YYYY-MM-DD 의 형태
    private String comment;   // VARCHAR = String
    private LocalDateTime createdAt;   // Date = YYYY-MM-DD 의 형태
    private LocalDateTime updatedAt;   // Date = YYYY-MM-DD 시간초.. 의 형태
    private String password;  // VARCHAR = String

    public Schedule (String name, LocalDate dating, String comment, String password) {

        this.name = name;
        this.dating = dating;
        this.comment = comment;
        this.password = password;
        this.createdAt = LocalDateTime.now();

    }

    public void update (LocalDate dating, String comment, String password){

        this.dating = dating;
        this.comment = comment;
        this.password = password;
        this.updatedAt = LocalDateTime.now();

    }

    public void updateDating (LocalDate dating) {

        this.dating = dating;
    }
}


