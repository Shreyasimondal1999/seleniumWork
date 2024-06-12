package exceptionHandling;
import java.util.Scanner;

public class exceptionHandlingPractise {
	
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	//exception handling
//	System.out.println("Enter two number");
//	
//	int a=s.nextInt();
//	int b = s.nextInt();
//	int c;
//	try {
//		c = a/b;
//		System.out.println("c"+c);
//	}catch(ArithmeticException e) {
//		System.out.println(e);
//		
//	}
//	System.out.println("bye, after executing catch block");

	// array out of bound exception
	int a[]= {0,1,2,3,4,5};
	int c ; 
	try {
		
	    try{
	    	System.out.println(a[10]);
	    }catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}
	    c = a[1]/a[0];
	    System.out.println("c"+ " "+ c);
	}catch(ArithmeticException e) {
		System.out.println(e);
	}   
	System.out.println("Bye");
	
	
	}
}

