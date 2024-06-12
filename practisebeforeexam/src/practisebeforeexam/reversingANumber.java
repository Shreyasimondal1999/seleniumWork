package practisebeforeexam;
import java.util.*;
public class reversingANumber {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	long num = sc.nextLong();
	long newNum=0;
	while(num!=0) {
	long a=num %10;
		newNum= newNum*10+a;
		num = num/10;
	}
	System.out.println(newNum);
}
}
