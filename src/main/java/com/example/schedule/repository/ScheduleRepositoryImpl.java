package com.example.schedule.repository;

import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Annotation @Service는 @Component와 같다, Spring Bean으로 등록한다는 뜻.
 * Spring Bean으로 등록되면 다른 클래스에서 주입하여 사용할 수 있다.
 * 명시적으로 Service Layer 라는것을 나타낸다.
 * 비지니스 로직을 수행한다.
 */
@Repository
public class ScheduleRepositoryImpl implements ScheduleRepository{
    //Repository 역할이 DB와 상호작용해서 데이터를 CRUD함.

    private final Map<Long, Schedule> scheduleList = new HashMap<>();

    @Override
    public Schedule saveSchedule(Schedule schedule) {

        Long scheduleId = scheduleList.isEmpty() ? 1 : Collections.max(scheduleList.keySet()) + 1;
        schedule.setId(scheduleId);

        scheduleList.put(scheduleId, schedule);

        return schedule;
    }

    @Override
    public List<ScheduleResponseDto> findAllSchedule() {

        //inin List
        List<ScheduleResponseDto> allSchedule = new ArrayList<>();

        for (Schedule schedule : scheduleList.values()) {
            ScheduleResponseDto responseDto = new ScheduleResponseDto(schedule);
            allSchedule.add(responseDto);
        }

        return allSchedule;
    }

    @Override
    public Schedule findShceduleById(Long id) {

        return scheduleList.get(id);
    }

    @Override
    public void deletSchedule(Long id) {
        scheduleList.remove(id);
    }
}

