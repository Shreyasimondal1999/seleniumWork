package practisebeforeexam;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.*;
public class MonthName {
	public static String getMonthName(String date) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d = LocalDate.parse(date,df);
		
		return d.getMonth().name();
	//	return d.getMonth().toString();
		
		
	}
public static void main(String are[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your date input");
	String str = sc.nextLine();
	System.out.println(getMonthName(str));
}
}
