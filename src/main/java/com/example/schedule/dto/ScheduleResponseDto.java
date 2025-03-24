package com.example.schedule.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class ScheduleResponseDto {
    //서버에서 클라이언트에게 주어야할 정보.

    private Long id;
    private String name;
    private Date dating;
    private String comment;
    private Date createdAt;
    private Date updatedAt;
    private String password;

}
