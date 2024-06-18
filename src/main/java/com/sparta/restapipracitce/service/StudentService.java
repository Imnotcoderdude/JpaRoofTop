package com.sparta.restapipracitce.service;

import com.sparta.restapipracitce.dto.StudentRequestDto;
import com.sparta.restapipracitce.dto.StudentResponseDto;
import com.sparta.restapipracitce.entity.Student;
import com.sparta.restapipracitce.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public StudentResponseDto addStudent(StudentRequestDto requestDto) {
        Student student = new Student(requestDto);

        Student addStudent = studentRepository.save(student);

        return new StudentResponseDto(addStudent);
    }

    public StudentResponseDto getStudentForId(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 학생이 없습니다."));

        return new StudentResponseDto(student);
    }
}
