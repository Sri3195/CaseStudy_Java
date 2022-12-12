package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Student;
import com.axis.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student student1=studentService.addStudent(student);
		return new ResponseEntity<Student>(student1,HttpStatus.OK);
		
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students= studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	@PutMapping("/student/{studentId}")
	public ResponseEntity<Student> updateStudentById(@PathVariable int studentId,@RequestBody Student student){
		Student student1=studentService.updateStudentByID(studentId, student);
		return new ResponseEntity<Student>(student1,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/student/{studentId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable int studentId){
		String message=studentService.deleteStudentByID(studentId);
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	@GetMapping("/student/{studentId}")
	public ResponseEntity<Student> getStudentById(@PathVariable int studentId)
	{
		Student student=studentService.getStudentByID(studentId);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
}
