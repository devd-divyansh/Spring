package com.nt;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;
import com.nt.controller.StudentController;

public class App {
	
  public static void main(String[] args) {
	  System.out.println("Hello World!");
 try {
  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
   StudentController controller =context.getBean("studentCont", StudentController.class);
         
   Student s1 = new Student(101, "Radha", 12, 99.99);
   Student s2 = new Student(102, "Shyam", 12, 99.99);
   Student s3 = new Student(103, "Gopal", 12, 99.99);
   Student s4 = new Student(104, "Krishna", 12, 99.99);
   Student s5 = new Student(105, "Lalju", 12, 99.99);
   System.out.println("hello");
   System.out.println("hi");
   System.out.println("bye bye");
   
   System.out.println(controller.RegisterStudents(List.of(s1, s2, s3, s4, s5)));
  
  }catch(Exception e) {
	e.printStackTrace();  
  }
  }
}
