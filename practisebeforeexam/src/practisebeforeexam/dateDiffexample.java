package practisebeforeexam;
import java.util.Date;
import java.text.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class dateDiffexample {
	 public static void main(String[] args) throws ParseException {
	        // Create two date objects
	       // Date startDate = new Date(); // Replace this with your start date
	        SimpleDateFormat sd= new SimpleDateFormat("dd-MM-yyyy");
	        Date startDate = sd.parse("26-12-1999");
	        Date endDate = new Date();   // Replace this with your end date
	        
	        // Calculate the difference in milliseconds
	        long differenceInMillis = endDate.getTime() - startDate.getTime();
	        long differenceInYears = endDate;
	        
	        // Convert milliseconds to days (1 day = 24 * 60 * 60 * 1000 milliseconds)
	        long differenceInDays = differenceInMillis / (24 * 60 * 60 * 1000);
	        
	        // Print the difference in days
	        System.out.println("Difference in days: " + differenceInDays/365);
	    }
}

