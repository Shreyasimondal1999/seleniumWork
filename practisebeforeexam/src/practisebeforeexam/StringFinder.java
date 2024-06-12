package practisebeforeexam;
import java.util.*;
public class StringFinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the input search string");
		String searchString = sc.nextLine();
	   String str1 = sc.nextLine();
	   String str2 = sc.nextLine();
	   if(searchString.indexOf(str2)>searchString.indexOf(str1)) {
		   System.out.println("yes");
	   }
	   else {
		   System.out.println("No");
	   }
		
	}

}
