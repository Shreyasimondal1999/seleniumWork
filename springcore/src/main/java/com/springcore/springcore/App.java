package com.springcore.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    Student stu1 = (Student)context.getBean("student1");
    System.out.println(stu1);
  }
}
