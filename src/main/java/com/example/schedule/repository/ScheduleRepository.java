package com.example.schedule.repository;

import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository {

    ScheduleResponseDto saveSchedule(Schedule schedule);

    List<ScheduleResponseDto> findAllSchedule();

    Schedule findShceduleById(Long id);

    ScheduleResponseDto findCommentById(Long id);


    int updateComment(Long id, String comment, String password,LocalDateTime updatedAt);

    int deletSchedule(Long id);
}
