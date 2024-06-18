package com.sparta.restapipracitce.entity;

import com.sparta.restapipracitce.dto.ExamRequestDto;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 고유번호

    private Float score; // 점수

    @Enumerated(EnumType.STRING)
    private Subject subject; // 과목타입

    private LocalDateTime examDate; // 시험일

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Exam() {

    }

    public Exam(ExamRequestDto requestDto, Student student) {
        this.score = requestDto.getScore();
        this.subject = requestDto.getSubject();
        this.examDate = LocalDateTime.now();
        this.student = student;
    }
}
