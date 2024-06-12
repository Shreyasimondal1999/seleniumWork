package practisebeforeexam;
import java.util.*;
public class MaxSubstring {
public static String extractMax(String str1,String str2) {
	String s = "";
	String s1[] = str1.split(str2);
	int length = s1.length;
	int maxLength=0;
	String arr[] = new String[length];
	int count=0;
	for(int i =0;i<length;i++) {
		if(s1[i].length()>maxLength) {
			//System.out.println("input:"+s1[i]);
			maxLength=s1[i].length();
			//System.out.println("maxlength:"+maxLength);
		}
	}
	for(int i =0;i<length;i++) {
		if(s1[i].length()>=maxLength) {
			//System.out.println("input:"+s1[i]);
			maxLength=s1[i].length();
			//System.out.println("maxlength:"+maxLength);
			arr[count++]=s1[i];
		}
	}
  s = arr[0];
	
    return s;
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string input");
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	System.out.println(extractMax(str1,str2));
	
}
}
