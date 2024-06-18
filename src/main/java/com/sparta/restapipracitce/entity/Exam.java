package com.sparta.restapipracitce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 고유번호

    private Long studentId; // 학생 아이디

    private Float score; // 점수

    private Subject subject; // 과목타입

    private LocalDateTime localDateTime; // 시험일

    public Exam() {

    }
}
