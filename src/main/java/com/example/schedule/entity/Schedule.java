package com.example.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Schedule {

    private Long id;          // 임의의 추가 숫자
    private String name;      // VARCHAR = String
    private Date dating;      // Date = YYYY-MM-DD 의 형태
    private String comment;   // VARCHAR = String
    private Date createdAt;   // Date = YYYY-MM-DD 의 형태
    private Date updatedAt;   // Date = YYYY-MM-DD 의 형태
    private String password;  // VARCHAR = String

//    public Schedule () {
//        this.id = id;
//        this.name = name;
//        this.dating = dating;
//        this.comment = comment;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//        this.password = password;
//    }


}