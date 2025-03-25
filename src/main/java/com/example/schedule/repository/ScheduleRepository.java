package com.example.schedule.repository;

import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;

import java.util.List;

public interface ScheduleRepository {

    Schedule saveSchedule(Schedule schedule);

    List<ScheduleResponseDto> findAllSchedule();

    Schedule findShceduleById(Long id);

    void deletSchedule(Long id);
}
