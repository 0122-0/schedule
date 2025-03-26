package com.example.schedule.controller;

import com.example.schedule.dto.ScheduleRequestDto;
import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController// @Controller + @ResponseBody
@RequestMapping("/schedules") //prefix

public class ScheduleController {

    // 주입된 의존성을 변경할 수 없어 객체의 상태를 안전하게 유지할 수 있다.
    private final ScheduleService scheduleService;

    /**
     * 생성자 주입
     * 클래스가 필요로 하는 의존성을 생성자를 통해 전달하는 방식
     * @param ScheduleService @Service로 등록된 MemoService 구현체인 Impl
     */
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    //포스트 맵핑을 이용한 스케줄 생성
    @PostMapping
    public ResponseEntity<ScheduleResponseDto> createSchedule(@RequestBody ScheduleRequestDto dto) {

        //Service Layer 호출 , 응답
        return new ResponseEntity<>(scheduleService.saveSchedule(dto), HttpStatus.CREATED);
    }

    //겟 맵핑을 이용한 일정 전체 조회
    @GetMapping
    public ResponseEntity<List<ScheduleResponseDto>> findAllSchedule(){

        return new ResponseEntity<>(scheduleService.findAllSchedule(),HttpStatus.OK);
    }

    //겟 맵핑을 이용한 일정 단일 조회
    @GetMapping("/{id}")
    public ResponseEntity<ScheduleResponseDto> findScheduleById(@PathVariable Long id) {

        return new ResponseEntity<>(scheduleService.findScheduleById(id), HttpStatus.OK);
    }

    //패치 맵핑을 이용한 일정 내용 변경
    @PatchMapping("/{id}")
    public ResponseEntity<ScheduleResponseDto> updateComment(
            @PathVariable Long id,
            @RequestBody ScheduleRequestDto dto
    ) {
        return new ResponseEntity<>(scheduleService.updateComment(id, dto.getComment(), dto.getPassword(), LocalDateTime.now()), HttpStatus.OK);
    }

    //딜리트 맵핑을 이용한 스케줄 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchedule(@PathVariable Long id, @RequestBody ScheduleRequestDto dto) {


        scheduleService.deleteSchedule(id, dto.getPassword());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}