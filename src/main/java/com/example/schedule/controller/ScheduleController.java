package com.example.schedule.controller;

import com.example.schedule.dto.ScheduleRequestDto;
import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ScheduleController {

    private final Map<Long, Schedule> scheduleList = new HashMap<>();

    public ScheduleResponseDto createScedule(@RequestBody ScheduleRequestDto dto){

        // 식별자 1씩 증가
        Long scheduleid = scheduleList.isEmpty() ? 1 : Collections.max(scheduleList.keySet()) + 1;
        // 요청받은 데이터로 Schedule 객체 생성
        Schedule schedule = new Schedule(scheduleid, dto.getName(), dto.getDating(), dto.getComment(), );
        //Inmemory DB에 Schedule 메모
        scheduleList.put(scheduleid, schedule);

    }
}
