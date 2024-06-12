package exceptionHandling;
import java.util.Scanner;
class NegativeDimensionException extends Exception{
	//overriding method of exception class
	public String toString() {
		return "dimension cannot be negative";
	}
}

public class throwUsingUserDefinedClass {
	public static int area(int l ,int b) throws NegativeDimensionException {
		int result;
		if (l<0|| b<0) {
			throw new NegativeDimensionException();
		}
		else {
			result = l*b;
		}
		return result;
	}
	public static int call(int l , int b) throws NegativeDimensionException{
		return area(l,b);
		
	}
	public static void main(String args[]){
		int length,breadth;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length and breadth");
		length = sc.nextInt();
		breadth = sc.nextInt();
	try {
		int result = call(length,breadth);
		System.out.println(result);
		}catch(NegativeDimensionException n) {
			System.out.println(n);
		}
		//int result = call(length,breadth);
		//System.out.println(result);
	}

}
