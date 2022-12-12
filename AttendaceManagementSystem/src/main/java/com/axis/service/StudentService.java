package com.axis.service;

import java.util.List;

import com.axis.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	public List<Student> getAllStudents();
	public Student updateStudentByID(int studentId,Student student);
	public String deleteStudentByID(int studentId);
	public Student getStudentByID(int studentId);

}
