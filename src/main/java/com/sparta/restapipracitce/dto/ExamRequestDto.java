package com.sparta.restapipracitce.dto;

import com.sparta.restapipracitce.entity.Subject;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExamRequestDto {

//    private Long studentId;

    private Float score;

    private Subject subject;

    private LocalDateTime examDate;


}
