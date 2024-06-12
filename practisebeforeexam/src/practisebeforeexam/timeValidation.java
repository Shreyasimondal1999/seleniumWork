package practisebeforeexam;

import java.util.*;

public class timeValidation {
	public static int validateTime(String time) {
		String split1[]=time.split(":");
		//String split2[]= split1[1].split("\\s");
		
		 String reghour="0[0-9]|1[0-2]";
		 String regMinutes ="[0-5][0-9][aAPp][Mm]";
		 //String regAmPm = "am|pm|AM|PM";
		
		if(split1[0].matches(reghour)&&split1[1].matches(regMinutes)) {
			return 1;
		}
		
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the time:");
		String time = sc.nextLine();
		int result = validateTime(time);
		if(result ==1) {
			System.out.println("valid time");
		}
		else {
			System.out.println("Invalid Time");
			
		}
	}
	

}
