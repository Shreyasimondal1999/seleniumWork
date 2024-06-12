package com.springcore.lifecyclemethods;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class main {
public static void main(String args[]) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecyclemethods/NewFile.xml");
	Samosa s = (Samosa)context.getBean("samosa1");
	//System.out.println(s.getPrice());
	context.registerShutdownHook();
	System.out.println("___________________");
 try {
		//Pepsi p = (Pepsi)context.getBean("pepsi1");
		//System.out.println(p.getPrice());
 }
 catch(Exception e) {
	 System.out.println(e.toString());
 }

	
	
}

}
