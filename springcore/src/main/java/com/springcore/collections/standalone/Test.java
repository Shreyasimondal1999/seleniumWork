package com.springcore.collections.standalone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/standalone/NewFile.xml");
		Student stud = (Student)context.getBean("Student1");
		//System.out.println(stud);
		System.out.println(stud.getStudentId());
		System.out.println(stud.getStudentName());
		System.out.println(stud.getAddress());
		System.out.println(stud.getRes().getY());
	}

}
