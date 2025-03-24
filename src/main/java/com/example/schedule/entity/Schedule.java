package com.example.schedule.entity;

import com.example.schedule.dto.ScheduleRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Schedule {
//Schedule에 객체 생성
    private Long id;
    private String name;
    private Long dating;
    private String comment;
    private Long creat_at;
    private Long update_at;
    private char password;

//Request 사용자에게 입력받아야할 것
    public void update(ScheduleRequestDto dto){
        this.name = dto.getName();
        this.dating = dto.getDating();
        this.comment = dto.getComment();
        this.password = dto.getPassword();
    }
}
