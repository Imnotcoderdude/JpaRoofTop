package com.sparta.restapipracitce.dto;

import com.sparta.restapipracitce.entity.Exam;
import com.sparta.restapipracitce.entity.Subject;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExamResponseDto {

    private Long studentId;

    private Float score;

    private Subject subject;

    private LocalDateTime examDate;

    public ExamResponseDto(Exam exam) {
        this.studentId = exam.getStudent().getId();
        this.score = exam.getScore();
        this.subject = exam.getSubject();
        this.examDate = exam.getExamDate();
    }

}
