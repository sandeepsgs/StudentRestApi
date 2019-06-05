package com.Students.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "school")
public class Student {
    @Id
    @GeneratedValue
    private Long rollno;
@NotBlank
private String student_name;

@NotBlank
    private String father_name;

@NotBlank
    private String classes;
public Student(){
    super();
}
public Student(Long rollno, @NotBlank String student_name, @NotBlank String father_name, @NotBlank String class1) {
	super();
	this.rollno = rollno;
	this.student_name = student_name;
	this.father_name = father_name;
	this.classes = class1;
}
public Long getRollno() {
	return rollno;
}
public void setRollno(Long rollno) {
	this.rollno = rollno;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getFather_name() {
	return father_name;
}
public void setFather_name(String father_name) {
	this.father_name = father_name;
}
public String getClasses() {
	return classes;
}
public void setClass(String class1) {
	classes = class1;
}

}
