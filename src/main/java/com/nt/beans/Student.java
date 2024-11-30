package com.nt.beans;

public class Student {
private Integer rollNo;
private String name;
private Integer grade;
private Double percentage;
public Student() {
	
	
}


public Integer getRollNo() {
	return rollNo;
}
public Student(Integer rollNo, String name, Integer grade, Double percentage) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.grade = grade;
	this.percentage = percentage;
}

public void setRollNo(Integer rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getGrade() {
	return grade;
}
public void setGrade(Integer grade) {
	this.grade = grade;
}
public Double getPercentage() {
	return percentage;
}
public void setPercentage(Double percentage) {
	this.percentage = percentage;
}
	

}
