package com.example.schedule.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    //클라이언트에게 입력 받을 정보

    private String name;
    private String comment;
    private String password;

}
