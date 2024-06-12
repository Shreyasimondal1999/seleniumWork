package practisebeforeexam;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;

public class validateDate {
	  public static int validateDatee(String str)
	    {
	        if(str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
	            SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	            sdf.setLenient(false);
	            try{
	                Date d1=sdf.parse(str);
	                return 1;
	            }catch(ParseException e){
	            return -1;
	            }
	       
	        } else {
	            return -1;
	        }
	    }
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String s1=sc.nextLine();
	        int b=validateDatee(s1);
	        if(b==1){
	        System.out.println("Valid date format");
	        }
	        else{
	        System.out.println("Invalid date format");
	        }
	        sc.close();
	    }

}
