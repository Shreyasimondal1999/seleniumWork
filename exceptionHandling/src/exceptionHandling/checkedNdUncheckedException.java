package exceptionHandling;

public class checkedNdUncheckedException {
	static void fun() {
		try {
		System.out.println(10/0);}
		catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
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
