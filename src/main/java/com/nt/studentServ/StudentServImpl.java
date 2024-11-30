package com.nt.studentServ;

import java.util.List;

import com.nt.beans.Student;
import com.nt.studentDAO.IStudentDAO;
import com.nt.studentDAO.StudentDAOImpl;

public class StudentServImpl implements IStudentServ  {

	private IStudentDAO studentDAO;
	
	public StudentServImpl(StudentDAOImpl studentDAO) {
             this.studentDAO=studentDAO;
	
             
             
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getGarde(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public String RegisterStudents(List<Student> students)throws Exception {
return		studentDAO.registerStudent(students);
	}
	
}
