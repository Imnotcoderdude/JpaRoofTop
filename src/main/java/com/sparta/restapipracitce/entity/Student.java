package com.sparta.restapipracitce.entity;

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
    private final Long id;

    // 2. 학번
    private final String studentNumber;

    // 3. 이름
    private final String name;

    // 4. 이메일
    private final String email;

    public Student(Long id, String studentNumber, String name, String email) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.name = name;
        this.email = email;
    }

}
