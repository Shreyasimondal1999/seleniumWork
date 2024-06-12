package exceptionHandling;
import java.util.*;
class finallypractise {
	static void fun() {
		try {
		System.out.println(10/0);}
		catch(InputMismatchException e) {
			
		}
	}
	static void fun1() {
		fun();
	}
	static void fun2() {
		fun1();
	}
public static void main(String args[]) {
	 fun2(); 
}
}
