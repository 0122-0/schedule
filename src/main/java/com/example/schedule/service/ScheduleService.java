package com.example.schedule.service;

import com.example.schedule.dto.ScheduleRequestDto;
import com.example.schedule.dto.ScheduleResponseDto;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleService {

    ScheduleResponseDto saveSchedule (ScheduleRequestDto dto);

    List<ScheduleResponseDto> findAllSchedule();

    ScheduleResponseDto findScheduleById(Long id);

    ScheduleResponseDto updateSchedule(Long id, LocalDate dating, String comment, String password);

    ScheduleResponseDto updateDating(Long id, LocalDate dating, String comment, String password);

    void deleteSchedule (Long id);
}
