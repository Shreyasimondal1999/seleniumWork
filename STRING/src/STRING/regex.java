package STRING;
import java.util.*;
public class regex {
	
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the date");
	String date = sc.next();
	String s[] = date.split("/");
	
			String regex1 = "[0-2][0-9]|30";
			String regex2 = "0[1-9]|1[1-2]";
			String regex3 = "[0-9]{4}";
			//String regex4 = "[0-2][0-9]|30[/]{1}0[1-9]|1[1-2][/]{1}[0-9]{4}";
			
	System.out.println(s[0].matches(regex1));
	System.out.println(s[1].matches(regex2));
	System.out.println(s[2].matches(regex3));
//	//System.out.println(date.matches(regex4));
//	
//	String s1= "ajdskj%*%(&jhkj%$$%#k";
//	System.out.println(s1.replaceAll("[^A-Za-z0-9]"," "));
//	System.out.println(s1.replaceAll("[^A-Za-z0-9]+"," "));
	
	
	
	
	System.out.println("___________________________");
	String str = "hello world shreyasi";
	String  str2 = "Mello just World";
	System.out.println(str.compareTo(str2));
	
}
}

