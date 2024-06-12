package datetimeproject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
public class datetimeclass {
public static void main(String args[]) throws ParseException {
	
	Date d0 = new Date();
	d0 = new SimpleDateFormat("dd-MM-yyyy").parse("2020-12-26");
	DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
	//Date dat = Date.parse("26-12-1999",df);
	System.out.println(d0);
	LocalDate d  = LocalDate.now();
	
	LocalDate d1=LocalDate.parse("2020-12-26");
	System.out.println(d.getMonth());
	System.out.println(d.getMonth().toString());
	System.out.println(d.getMonth().name());
	System.out.println(d.getMonth().toString().equals(d.getMonth().name()));
System.out.println(	d.getDayOfWeek().equals("TUESDAY"));
System.out.println(d.isBefore(d1));
System.out.println(d.getDayOfYear());
System.out.println(d.getYear());
System.out.println(d.lengthOfMonth());
System.out.println(d.minusDays(5));
System.out.println(df.format(d));



}
}
