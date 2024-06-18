package com.sparta.restapipracitce.controller;

import com.sparta.restapipracitce.dto.ExamRequestDto;
import com.sparta.restapipracitce.dto.ExamResponseDto;
import com.sparta.restapipracitce.dto.StudentRequestDto;
import com.sparta.restapipracitce.dto.StudentResponseDto;
import com.sparta.restapipracitce.service.ExamService;
import com.sparta.restapipracitce.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

//    private final StudentMap studentMap;
    private final StudentService studentService;
    private final ExamService examService;

    public StudentController(StudentService studentService, ExamService examService) {
        this.studentService = studentService;
        this.examService = examService;
    }

    // 학생 등록
    @PostMapping("/signup")
    public StudentResponseDto addStudent(@RequestBody StudentRequestDto requestDto) {
        return studentService.addStudent(requestDto);
    }

    // id 기반 학생 조회
    @GetMapping("/{id}")
    public StudentResponseDto getStudentForId(@PathVariable Long id) {
        return studentService.getStudentForId(id);
    }

    // id 기반 학생에 시험과목과 시험일자 추가
    @PostMapping("/{id}/exam")
    public ExamResponseDto addExam(@PathVariable Long id,@RequestBody ExamRequestDto requestDto) {
        return examService.addExam(id,requestDto);
    }
















    // 이 밑으로는 REST API 시간에 작성한부분
    // 학생 등록 api
    // (POST) /students
//    @PostMapping
//    public ResponseEntity<?> addStudent(@RequestBody StudentRequestDto studentRequestDto) {
//
//        this.studentMap.add(studentRequestDto.getId(), studentRequestDto);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body("학생 등록이 완료되었습니다.");
//    }
//
//    // id로 학생 조회.
//    // (GET) /students/{id}
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
//
//        Student student = this.studentMap.getById(id);
//
//        return ResponseEntity.status(HttpStatus.OK).body(student);
//    }
//
//    // 전체 학생 조회
//    @GetMapping
//    public ResponseEntity<?> getStudents(@RequestParam(value = "number", required = false) String studentNumber) {
//
//        // 학번에 해당하는 학생 조회
//        // (GET) /students?number=20202020
//        if (StringUtils.hasLength(studentNumber)) {
//            Student student = this.studentMap.getByNumber(studentNumber);
//            return ResponseEntity.status(HttpStatus.OK).body(student);
//        }
//
//        List<Student> studentList = this.studentMap.getAll();
//
//        return ResponseEntity.status(HttpStatus.OK).body(studentList);
//    }

    /*
     URL로 입력 받는 방법
     1. path -> /students/1

     @GetMapping("/{studentId}/subjects/{subjectId}")
     public ResponseEntity<?> getStudentById(
             @PathVariable Long studentId,
             @PathVariable Long subjectId)

     2. parameter -> /students?number=20245190

     public ResponseEntity<?> sample(
            @RequestParam String studentNumber,
            @RequestParam String name
)

     */


}
