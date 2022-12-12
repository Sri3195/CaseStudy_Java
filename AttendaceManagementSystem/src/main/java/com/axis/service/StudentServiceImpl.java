package com.axis.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Student;
import com.axis.exception.IDNotFoundException;
import com.axis.repository.StudentRepository;
import com.axis.utils.AppConstants;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudentByID(int studentId, Student student) {
		Student stu=studentRepository.findById(studentId)
				.orElseThrow(()->new IDNotFoundException(AppConstants.ID_NOT_FOUND));
		
			stu.setStudentRollno(student.getStudentRollno());
			stu.setStudentName(student.getStudentName());
			stu.setStudentEmail(student.getStudentEmail());
			stu.setStudentContact(student.getStudentContact());
			stu.setStudentClass(student.getStudentClass());
			stu.setStudentAddress(student.getStudentAddress());
			return studentRepository.save(stu);
	}

	@Override
	public String deleteStudentByID(int studentId) {
		Student student=studentRepository.findById(studentId).orElseThrow((()->new IDNotFoundException(AppConstants.ID_NOT_FOUND)));
		studentRepository.delete(student);
		return AppConstants.DELETE_MESSAGE;
	}

	@Override
	public Student getStudentByID(int studentId) {
		
		return studentRepository.findById(studentId).orElseThrow(()-> new IDNotFoundException(AppConstants.ID_NOT_FOUND));
		
	}
	

}
