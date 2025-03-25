package com.example.schedule.service;

import com.example.schedule.dto.ScheduleRequestDto;
import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;
import com.example.schedule.repository.ScheduleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

/**
 * Annotation @Service는 @Component와 같다, Spring Bean으로 등록한다는 뜻.
 * Spring Bean으로 등록되면 다른 클래스에서 주입하여 사용할 수 있다.
 * 명시적으로 Service Layer 라는것을 나타낸다.
 * 비지니스 로직을 수행한다.
 */

@Service
public class ScheduleServiceImpl implements ScheduleService{
    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository){
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public ScheduleResponseDto saveSchedule(ScheduleRequestDto dto) {
        Schedule schedule = new Schedule(dto.getName(), dto.getDating(), dto.getComment(), dto.getPassword());

        return scheduleRepository.saveSchedule(schedule);
    }

    @Override
    public List<ScheduleResponseDto> findAllSchedule() {

        return scheduleRepository.findAllSchedule();
    }

    @Override
    public ScheduleResponseDto findScheduleById(Long id) {

        Schedule shcedule = scheduleRepository.findShceduleById(id);

        if (shcedule == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id =" + id);
        }

        return new ScheduleResponseDto(shcedule);
    }

    @Override
    public ScheduleResponseDto updateSchedule(Long id, LocalDate dating, String comment, String password) {

        Schedule shcedule = scheduleRepository.findShceduleById(id);

        if (shcedule == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id =" + id);
        }

        if (dating == null || comment == null || password == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"THe dating and commet and password are required values.");
        }

        shcedule.update(dating, comment, password);
        return new ScheduleResponseDto(shcedule);
    }

    @Override
    public ScheduleResponseDto updateDating(Long id, LocalDate dating, String comment, String password) {

        Schedule shcedule = scheduleRepository.findShceduleById(id);

        if (shcedule == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id =" + id);
        }

        if (dating == null || comment != null || password != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"The dating and commet and password are required values.");
        }

        shcedule.updateDating(dating);

        return new ScheduleResponseDto(shcedule);
    }

    @Override
    public void deleteSchedule(Long id) {
        Schedule shcedule = scheduleRepository.findShceduleById(id);

        if (shcedule == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id =" + id);
        }

        scheduleRepository.deletSchedule(id);

    }
}
