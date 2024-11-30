package com.nt.studentServ;

import java.util.List;

import com.nt.beans.Student;

public interface IStudentServ {

public List<Student> getAllStudents();
public String RegisterStudents(List<Student>students) throws Exception;
public String getGarde(Student student);
	
	
		
}
