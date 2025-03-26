package com.example.schedule.service;

import com.example.schedule.dto.ScheduleRequestDto;
import com.example.schedule.dto.ScheduleResponseDto;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleService {

    //저장
    ScheduleResponseDto saveSchedule (ScheduleRequestDto dto);
    //조회
    List<ScheduleResponseDto> findAllSchedule();
    //조회
    ScheduleResponseDto findScheduleById(Long id);
    //수정
    ScheduleResponseDto updateComment (Long id, String comment, String password, LocalDateTime updatedAt);
    //삭제
    void deleteSchedule (Long id, String password);
}
