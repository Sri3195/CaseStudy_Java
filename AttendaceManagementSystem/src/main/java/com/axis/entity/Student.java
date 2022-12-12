package com.axis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	public Student(int studentId, int studentRollno, String studentName, String studentEmail, String studentContact,
			String studentAddress, String studentClass) {
		super();
		this.studentId = studentId;
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentContact = studentContact;
		this.studentAddress = studentAddress;
		this.studentClass = studentClass;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int studentId;
	private int studentRollno;
	private String studentName;
	private String studentEmail;
	private String studentContact;
	private String studentAddress;
	private String studentClass;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentRollno() {
		return studentRollno;
	}
	public void setStudentRollno(int studentRollno) {
		this.studentRollno = studentRollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	
	
}
