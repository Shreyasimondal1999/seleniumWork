package practisebeforeexam;
import java.time.*;
import java.time.Period;
import java.time.Duration;
import java.time.format.*;

public class TimeONLY {
	public static void main(String args[]) {
		LocalDateTime lt = LocalDateTime.now();
		//LocalDateTime ltt = LocalDateTime.parse("26-12-1999 05:30:40");
		String pattern = "dd-MM-yyyy HH:mm:ss";
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime ltt = LocalDateTime.parse("26-12-1999 05:30:40",df);
		System.out.println(ltt.getHour());
		System.out.println(ltt.isAfter(lt));
		DateTimeFormatter df1= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d = LocalDate.parse("24-12-2024",df1);
		System.out.println(df1.format(d));
		Duration d0 = Duration.between(ltt,lt );
		
		System.out.println(d0.getSeconds());
		LocalDate d1= LocalDate.parse("24-12-2025",df1);
		
		Period p = Period.between(d, d1);
		System.out.println(p.getYears());
		System.out.println(df.format(ltt));
	}
	

}
