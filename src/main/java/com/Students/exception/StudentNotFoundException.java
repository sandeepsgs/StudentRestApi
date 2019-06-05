package com.Students.exception;

public class StudentNotFoundException  extends Exception  {

private long rollno;

public StudentNotFoundException(long rollno) {
        super(String.format("Student is not found with rollno : '%s'", rollno));
        }
}
