package com.sparta.restapipracitce.db;

// 데이터베이스 대용

import com.sparta.restapipracitce.dto.StudentRequestDto;
import com.sparta.restapipracitce.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class StudentMap {
    private Map<Long, Student> studentMap;

    public StudentMap() {
        this.studentMap = new ConcurrentHashMap<>();
    }

    public void add(Long id, StudentRequestDto studentRequestDto) {
        Student student = this.convertDtoToStudent(studentRequestDto);
        this.studentMap.put(id, student);
    }

    // 특정 ID의 Student를 가져오는 메서드
    public Student getById(Long id) {
        return this.studentMap.get(id);
    }

    public Student getByNumber(String studentNumber) {
        // Student List 에서 StudentNumber 에 해당하는 Student 를 찾는다.
        List<Student> studentList = this.studentMap
                .values()
                .stream()
                .filter(student -> student.getStudentNumber().equals(studentNumber))
                .toList();

        return studentList.get(0);
    }

    // 전체 조회
    public List<Student> getAll() {
        return this.studentMap.values().stream().toList();
    }



    // dto 를 student 로 변환
    private Student convertDtoToStudent(StudentRequestDto studentRequestDto) {
        return new Student(
                studentRequestDto.getId(),
                studentRequestDto.getStudentNumber(),
                studentRequestDto.getName(),
                studentRequestDto.getEmail()
        );
    }
}
