package com.sparta.restapipracitce.dto;

import com.sparta.restapipracitce.entity.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponseDto {

    private String studentNumber;

    private String name;

    private String email;

    public StudentResponseDto(Student addStudent) {
        this.studentNumber = addStudent.getStudentNumber();
        this.name = addStudent.getName();
        this.email = addStudent.getEmail();
    }
}
