package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {
    //서버에서 클라이언트에게 주어야할 정보.

    private Long id;
    private String name;
    private LocalDate dating;
    private String comment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String password;

    public ScheduleResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.name = schedule.getName();
        this.dating = schedule.getDating();
        this.comment = schedule.getComment();
        this.password = schedule.getPassword();
        this.createdAt = LocalDateTime.now();
    }


}
