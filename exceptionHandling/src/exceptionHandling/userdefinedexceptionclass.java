package exceptionHandling;
class exceptionuserdefined extends Exception{
	public String toString() {
		return "Balance should not be less than 5000 ";
	}
}
public class userdefinedexceptionclass {
	static void fun() {
		try {
		throw new exceptionuserdefined();
		}
		catch(exceptionuserdefined e) {
			System.out.println(e);
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
