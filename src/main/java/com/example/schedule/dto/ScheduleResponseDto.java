package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {

    private String name;
    private Long dating;
    private String comment;
    private Long creat_at;
    private Long update_at;

    public ScheduleDto(Schedule schedule){
        this.name = schedule.getName();
        this.dating = schedule.getDating();
        this.comment = schedule.getComment();
        this.creat_at = schedule.getCreat_at();
        this.update_at = schedule.getUpdate_at();
    }

}
