package com.springcore.auto.wire.annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {
public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotations/NewFile.xml");
	ManagerEmployee me = (ManagerEmployee)context.getBean("ME1");
	System.out.println(me.getSalaryDetails().getToatalsalary());
}
}
