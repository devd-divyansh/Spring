package com.nt.studentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.nt.beans.Student;



public class StudentDAOImpl implements IStudentDAO {
	
private DataSource dataSource;

private static final  String INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?,?)";

private static final String SELECT_QUERY="SELECT  * FROM STUDENT";

public StudentDAOImpl(DataSource datasource) {
this.dataSource=datasource;

}

// zero -Param Consttructor
public StudentDAOImpl() {

}



@Override
	public String fetchStudent(Student student) {


		return null;
	}

@Override
	public String registerStudent(List<Student> student) throws Exception,SQLException{

	try(Connection con=dataSource.getConnection();
		PreparedStatement pstmt  =con.prepareStatement(INSERT_QUERY);
			) {// try outer start
		if(con!=null) {
			student.forEach((students)->{
				try {
					pstmt.setInt(1,students.getRollNo() );
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				try {
					pstmt.setString(2, students.getName());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	             
				try {
					pstmt.setInt(3, students.getGrade());
				}catch(SQLException se) {
					se.printStackTrace();
				}
				
				try {
					pstmt.setDouble(4, students.getPercentage());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					record = pstmt.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			) ;// for each ends
			
			return "Students are Sucessfully Registered With Us";
		
		}// if
	}catch(SQLException se) {
		se.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
		
return "Student Is  Not Registerd into Database";

}
	
}
