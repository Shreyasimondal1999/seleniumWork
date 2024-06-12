package practisebeforeexam;
import java.util.*;
public class CharecterCleaning {
	
	public static String removeChar(String str,char c) {
		String s= "";
//		int index = str.indexOf(c);
//		if(index!=0) {
//			s = str.substring(0, index-1)+str.substring(index+1);	
//
//		}
//		else {
//			s=str.substring(index+1);
//		}
//		return s; 
		char c1[]= str.toCharArray();
		int j =0;
		int size = c1.length;
		char c2[] = new char[str.length()];
		for(int i = 0; i<size;i++) {
 			if(c1[i]!=c) {
 				c2[j++]=c1[i];
 			}
 		}
       s = String.valueOf(c2,0,j);
       return s;
	}
	
	
	
	





public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String inputstring = sc.nextLine();
	System.out.println("Enter the charecter");
	char c = sc.next().charAt(0);
	System.out.println(removeChar(inputstring,c));
}
}
