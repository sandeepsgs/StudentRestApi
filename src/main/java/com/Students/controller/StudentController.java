package com.Students.controller;
import com.Students.exception.StudentNotFoundException;
import com.Students.model.Student;
import com.Students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;
@RestController
public class StudentController {

@Autowired
    StudentRepository studentRepository;
@GetMapping("/students")
public List<Student> getAllStudents() {
    return studentRepository.findAll();
}
@PostMapping("/students/insert")
public Student createStudent(@Valid @RequestBody Student students) {
    return studentRepository.save(students);
}
@GetMapping("/studentsByRollno/{rollno}")
public Student getNoteById(@PathVariable(value = "rollno") Long rollno) throws StudentNotFoundException {
    return studentRepository.findById(rollno)
            .orElseThrow(() -> new StudentNotFoundException(rollno));
}
@PutMapping("/student/{rollno}")
public Student updateNote(@PathVariable(value = "rollno") Long rollno,
                       @Valid @RequestBody Student studentDetails) throws StudentNotFoundException {

Student student = studentRepository.findById(rollno)
            .orElseThrow(() -> new StudentNotFoundException(rollno));

student.setStudent_name(studentDetails.getStudent_name());
student.setFather_name(studentDetails.getFather_name());
student.setClass(studentDetails.getClasses());

Student updatedStudent = studentRepository.save(student);

return updatedStudent;
}
@DeleteMapping("/student/{rollno}")
public ResponseEntity<?> deleteBook(@PathVariable(value = "rollno") Long rollno) throws StudentNotFoundException {
    Student students = studentRepository.findById(rollno)
            .orElseThrow(() -> new StudentNotFoundException(rollno));

studentRepository.delete(students);

return ResponseEntity.ok().build();
}
}
