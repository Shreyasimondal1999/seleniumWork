package com.springcore.constructorinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String args[]) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/constructorinjection/NewFile.xml");
		Employee emp = (Employee)context.getBean("Employee1");
		System.out.println(emp.toString());
	}

}
