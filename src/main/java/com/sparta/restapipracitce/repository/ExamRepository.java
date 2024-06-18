package com.sparta.restapipracitce.repository;

import com.sparta.restapipracitce.entity.Exam;
import com.sparta.restapipracitce.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    Optional<Exam> findByStudent_IdAndSubject(Long studentId, Subject subject);
}
