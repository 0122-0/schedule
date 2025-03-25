package com.example.schedule.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ScheduleRequestDto {
    //클라이언트에게 입력 받을 정보

    private String name;
    private LocalDate dating; //일정 날짜
    private String comment;
    private String password;

}
