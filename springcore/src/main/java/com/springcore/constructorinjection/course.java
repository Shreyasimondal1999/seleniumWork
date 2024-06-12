package com.springcore.constructorinjection;

public class course {
private String courseName ;
public void setCourseName(String name) {
	this.courseName  = name;
}
public String getCourseName() {
	return this.courseName;
}
public String toString() {
	return  this.courseName;
}
}
