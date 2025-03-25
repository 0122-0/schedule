package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ScheduleResponseDto {
    //서버에서 클라이언트에게 주어야할 정보.

    private Long id;
    private String name;
    private String comment;
    private LocalDateTime updateAt;

    public ScheduleResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.name = schedule.getName();
        this.comment = schedule.getComment();
        this.updateAt = LocalDateTime.now();
    }


}
