package com.Students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Students.model.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long>{

}
