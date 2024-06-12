package javaLangpractise;

public class wrapperPractise {
public static void main(String args[]) {
	 int a ;
	 byte b = 15;
	// Byte b1 = Byte.valueOf(10);
	 Byte b1 = Byte.valueOf(b);
	 int m1 = 15;
	 Integer m2 = m1;
	 System.out.println( m2.equals(15));
	System.out.println( m2.compareTo(19));
	//static method
	  Integer m3 = Integer.valueOf(20);
	  //second argument id the radix
	  Integer m4 = Integer.valueOf("  ",2);
	  System.out.println(m4);
	 // StringBuilder str = "hello"; cannot give string tosTRING bUILDER
	  char a[] = {'w','o','r','l','d'};
	  str.append(a);
}
