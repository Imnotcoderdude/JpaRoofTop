package com.sparta.restapipracitce.service;

import com.sparta.restapipracitce.dto.ExamRequestDto;
import com.sparta.restapipracitce.dto.ExamResponseDto;
import com.sparta.restapipracitce.entity.Exam;
import com.sparta.restapipracitce.entity.Student;
import com.sparta.restapipracitce.entity.Subject;
import com.sparta.restapipracitce.repository.ExamRepository;
import com.sparta.restapipracitce.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExamService {

    private final ExamRepository examRepository;
    private final StudentRepository studentRepository;

    public ExamService(ExamRepository examRepository, StudentRepository studentRepository) {
        this.examRepository = examRepository;
        this.studentRepository = studentRepository;
    }

    @Transactional
    public ExamResponseDto addExam(Long id, ExamRequestDto requestDto) {

        Student student = studentRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("해당 학생이 없습니다."));

        Exam exam = new Exam(requestDto,student);

        Exam saveExam = examRepository.save(exam);

        return new ExamResponseDto(saveExam);
    }

    public ExamResponseDto getExam(Long studentId, Subject subject) {
        Exam exam = examRepository.findByStudent_IdAndSubject(studentId,subject).orElseThrow(()
                -> new IllegalArgumentException("요청하신 학생의 요청하신 과목에 대한 시험이 없습니다."));
        return new ExamResponseDto(exam);
    }

}
