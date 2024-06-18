package com.sparta.restapipracitce.dto;

import lombok.Getter;

@Getter
public class StudentRequestDto {

    // 엔티티 고유번호 : id
    private final Long id;

    // 학번 필드
    private final String studentNumber;

    // 이름 필드
    private final String name;

    // 이메일 필드
    private final String email;

    public StudentRequestDto(Long id, String studentNumber, String name, String email) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.name = name;
        this.email = email;
    }
}
