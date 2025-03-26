package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ScheduleResponseDto {
    //서버에서 클라이언트에게 주어야할 정보.
    //비밀번호는 보안 문제상 넣지 않음
    private Long id;
    private String name;
    private String comment;
    //제이슨 포맷을 이용해서 표기법 바꿔주기
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd")
    private LocalDateTime updateAt;

    public ScheduleResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.name = schedule.getName();
        this.comment = schedule.getComment();
        this.updateAt = LocalDateTime.now();
    }


}
