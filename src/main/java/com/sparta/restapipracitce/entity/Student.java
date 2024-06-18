package com.sparta.restapipracitce.entity;

import com.sparta.restapipracitce.dto.StudentRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Student {


    // 1. ID (고유번호)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 2. 학번
    private String studentNumber;

    // 3. 이름
    private String name;

    // 4. 이메일
    private String email;


    public Student(StudentRequestDto requestDto) {
        this.studentNumber = requestDto.getStudentNumber();
        this.name = requestDto.getName();
        this.email = requestDto.getEmail();
    }

    public Student() {

    }
}
