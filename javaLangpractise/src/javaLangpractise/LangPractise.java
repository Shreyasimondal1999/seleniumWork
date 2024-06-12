package javaLangpractise;
import java.lang.*;
class myObject{
	
}
public class LangPractise {
public static void main(String args[]) {
	Object o = new Object();
	System.out.println(o.toString());
	System.out.println(o);
	Object o1 = o;
	System.out.println(o.equals(o1));
	System.out.println(o.hashCode());
	// object class is parent class of every class
	myObject mo = new myObject();
	System.out.println(mo.toString());
}
}
