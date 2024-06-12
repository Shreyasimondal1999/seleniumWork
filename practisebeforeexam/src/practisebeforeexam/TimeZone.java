package practisebeforeexam;
import java.util.*;
class TimeConverter{
	private int hours;
	private int minutes;
	private int seconds;
	private String meridiem;
	public int getHours() {
	return hours;
	}
	public void setHours(int hours) {
	this.hours = hours;
	}
	public int getMinutes() {
	return minutes;
	}
	public void setMinutes(int minutes) {
	this.minutes = minutes;
	}
	public int getSeconds() {
	return seconds;
	}
	public void setSeconds(int seconds) {
	this.seconds = seconds;
	}
	public String getMeridiem() {
	return meridiem;
	}
	public void setMeridiem(String meridiem) {
	this.meridiem = meridiem;
	}
	public TimeConverter(int hours, int minutes, int seconds,String meridiem) {
	super();
	this.hours = hours;
	this.minutes = minutes;
	this.seconds = seconds;
	this.meridiem = meridiem;
	}
	 
	public TimeConverter() {
	super();
	}
	
		public String convertToGMT(){
		    //fill the code here
			int newhrtime=0;
			int newminTime=0;
			
			
			if(hours<=0||hours>12) {
				return "Error";
			}
			if(minutes <0 || seconds<0||minutes>=60||seconds>=60) {
				return "Error";
			}

			if(!(meridiem.equalsIgnoreCase("am")||meridiem.equalsIgnoreCase("pm"))) {
				return "Error";
			}
			else {
				if(this.hours-5<=0) {
					newhrtime = 12+(this.hours-5);
					if(this.meridiem.equalsIgnoreCase("am")) {
						this.meridiem = "PM";
					}
					else {
						this.meridiem = "AM";
					}
				}
				else {
					 newhrtime = this.hours-5;
				}
				
				if(this.minutes-30<0 && newhrtime==1) {
					newhrtime = 12;
				 newminTime = 60+(this.minutes-30);
					if(this.meridiem.equalsIgnoreCase("am")) {
						this.meridiem = "PM";
					}
					else {
						this.meridiem = "AM";
					}
				}
				if(this.minutes-30<0) {
				 newminTime = 60+(this.minutes-30);
				}
				else {
					 newminTime = this.minutes-30;
				}
				
			}
		
			if((newhrtime==1||newhrtime==2||newhrtime==3||newhrtime==4||newhrtime==5||newhrtime==6||newhrtime==7
					||newhrtime==8||newhrtime==9)&&this.seconds==0) {
				//System.out.println("c1");
				return "0"+newhrtime+":"+newminTime+":"+this.seconds+"0"+":"+this.meridiem;
				
			}else if((newhrtime==1||newhrtime==2||newhrtime==3||newhrtime==4||newhrtime==5||newhrtime==6||newhrtime==7
				||newhrtime==8||newhrtime==9)&&this.seconds!=0) {
				//System.out.println("c2");
			return "0"+newhrtime+":"+newminTime+":"+this.seconds+":"+this.meridiem;
		    }	
			else if(this.seconds==0) {
				//System.out.println("c3");
				return newhrtime+":"+newminTime+":"+this.seconds+"0"+":"+this.meridiem;
			}
			//System.out.println("c4");
			return newhrtime+":"+newminTime+":"+this.seconds+this.meridiem;
			
		// return null;
		      
		}
	
	
	
	
	
}

public class TimeZone {
	public static TimeConverter extractDetails(String time) {
		
		String s[]=time.split(":");
		
		TimeConverter t = new TimeConverter(Integer.parseInt(s[0]), Integer.parseInt(s[1]),Integer.parseInt(s[2]),s[3]);
		return t;
	}
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	//fill the code here
	System.out.println("Enter the details");
	String details=sc.next();
	TimeConverter obj=extractDetails(details);
	String ans=obj.convertToGMT();
	if(ans.equals("Error"))
	{
	    System.out.println("Invalid time details");
	}
	else{
	System.out.println("IST: "+details);
	System.out.println("GMT: "+ans);
	}
}
}
	