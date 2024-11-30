package com.nt.controller;

import java.util.List;

import com.nt.beans.Student;
import com.nt.studentServ.IStudentServ;


public class StudentController {
           
	
 	private IStudentServ studentServ;

 	public StudentController() {
		// TODO Auto-generated constructor stub
	}
 	
 	public StudentController(IStudentServ studentServ) {
	this.studentServ=studentServ;
 	}
 	
 	
	public String getStudentGrades(Student  student) {
	
		return "";
	}
	
	
	public String RegisterStudents(List<Student> students)throws Exception {
	 return studentServ.RegisterStudents(students);	
		
	}
	
	
	public List<Student> getStudents(){
	return null;	
	}		
		
	}
	

