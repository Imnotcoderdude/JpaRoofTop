package com.sparta.restapipracitce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDto {

    // 학번 필드
    private String studentNumber;

    // 이름 필드
    private String name;

    // 이메일 필드
    private String email;

}
