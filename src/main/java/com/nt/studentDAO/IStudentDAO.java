package com.nt.studentDAO;

import java.util.List;

import com.nt.beans.Student;

public interface IStudentDAO {

	public String registerStudent(List<Student> student) throws Exception;
    
	public String fetchStudent(Student student);


}
