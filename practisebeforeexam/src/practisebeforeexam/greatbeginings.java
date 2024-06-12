package practisebeforeexam;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class Event {
	
	private String eventId;
	private String eventType;
	private Date dateOfRegistration;
	private Date dateOfEvent;
	private double payment;
	
	public Event() {
		super();
	}
	public Event(String eventId, String eventType, Date dateOfRegistration, Date dateOfEvent, double payment) {
		super();
		this.eventId = eventId;
		this.eventType = eventType;
		this.dateOfRegistration = dateOfRegistration;
		this.dateOfEvent = dateOfEvent;
		this.payment = payment;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public Date getDateOfEvent() {
		return dateOfEvent;
	}
	public void setDateOfEvent(Date dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	public double calculateAmountToBePaid() {
 
		 
		double discount=0.0;
		  if(payment<=0){
		      return -1;
		  }else{
		  if("Weddings".equalsIgnoreCase(eventType)){
		      discount=12;
		  }else if("Charity".equalsIgnoreCase(eventType)){
		      discount=9;
		  }else if("ProductLaunch".equalsIgnoreCase(eventType)){
		      discount=15;
		  }else if("Exhibitions".equalsIgnoreCase(eventType)){
		      discount=5;
		  }else if("Workshops".equalsIgnoreCase(eventType)){
		      discount=7;
		  }else{
		      return -1;
		  }
		  }
		return payment-(payment*(discount/100));
		 
	}
	
 
}
public class greatbeginings {
	 

	public static Event extractDetails(String eventDetails) throws ParseException
	{
		String s[]=eventDetails.split(":");
		String s1=s[0];
		String s2=s[1];
		Date s3=new SimpleDateFormat("dd/MM/yyyy").parse(s[2]);
		//System.out.println("s3"+s3);
		Date s4=new SimpleDateFormat("dd/MM/yyyy").parse(s[3]);
		double s5=Double.parseDouble(s[4]);
		return new Event(s1,s2,s3,s4,s5);
	}
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Event Details");
		String s=sc.next();
		Event e=extractDetails(s);
		double d=e.calculateAmountToBePaid();
		if(d==-1){
		    System.out.println("Invalid Event Details");
		}else{
			SimpleDateFormat s3=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Event Id : "+e.getEventId());
		System.out.println("Event Type : "+e.getEventType());
		System.out.println("Date of Registration : "+s3.format(e.getDateOfRegistration()));
		System.out.println("Date of Event : "+s3.format(e.getDateOfEvent()));
		System.out.println("Payment : "+e.getPayment());
		System.out.println("Amount to be paid by Customer : "+d);
		}

	}
}
