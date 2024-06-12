package practisebeforeexam;
import java.util.*;

class TicketInfo {
	private String pasengerName  ;
	private int noOfTickets  ;
	private String seatType  ;
	private String mobileNumber;
	private String insurance ;
	public String getPasengerName() {
		return pasengerName;
	}
	public void setPasengerName(String pasengerName) {
		this.pasengerName = pasengerName;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public TicketInfo(String pasengerName, int noOfTickets, String seatType, String mobileNumber, String insurance) {
		super();
		this.pasengerName = pasengerName;
		this.noOfTickets = noOfTickets;
		this.seatType = seatType;
		this.mobileNumber = mobileNumber;
		this.insurance = insurance;
	}
	public TicketInfo() {
		super();
	}
	public double getTicketCost(String seatType) {
		double cost=0;
		//System.out.println(seatType);
		if(seatType.compareToIgnoreCase("Sleeper")==0) {
			cost = 2200 + 2200*0.05 + 2200*0.045;
		}
		else if(seatType.compareToIgnoreCase("General")==0) {
			cost = 1700 + 2200*0.04 + 2200*0.045;
		}
		else if(seatType.compareToIgnoreCase("Unreserve")==0) {
			cost = 200;
		}
		else {
			cost = -1;
		}
		return cost;
		
	}
	public double	getTotalBookingCost()  {
		if(getTicketCost(seatType)==-1)
			return -1;
		if(insurance.equalsIgnoreCase("yes")) {
			return noOfTickets*( 49+getTicketCost(seatType));
		}
		else if(insurance.equalsIgnoreCase("no")) {
			return noOfTickets*getTicketCost(seatType);
		}
		else
			return -1;
	}
}

public class busTicketproblem {
	public static List<TicketInfo> getTickets(String seatType , List<TicketInfo> sourceList) {
		/*List<TicketInfo> list = new ArrayList<>();
		for(TicketInfo t: sourceList) {
			if(t.getSeatType().equals(seatType)) {
				list.add(t);
			}
		}
		return list;*/
		return sourceList.stream().filter(t->t.getSeatType().equals(seatType)).toList();
	}
	public static int countTickets(String seatType , List<TicketInfo> list) {
		int count =0;
		for(TicketInfo t : list) {
			if(t.getSeatType().equalsIgnoreCase(seatType)) {
			count = count + t.getNoOfTickets();	
			}
		}
		return count;
	}
	public static TicketInfo getDetails(String ticketDetails) {
		//Raj:2:General:8879678456:yes
		
		String s[]	= ticketDetails.split(":");
		System.out.println(s[2]);
		TicketInfo t= new TicketInfo(s[0],Integer.parseInt(s[1]),s[2],s[3],s[4]);
				return t;
	}
	public static List<TicketInfo> getAllTicketInfo(String ticketsdetails[]){
		List<TicketInfo>  l = new ArrayList<>();
		
		for(String item : ticketsdetails) {
		TicketInfo t = getDetails(item);
		l.add(t);
		}
		return l;
	}
	public static void main(String agrs[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the ticket details:");
		String ticketDetails = sc.nextLine();
		TicketInfo t = getDetails(ticketDetails);
		System.out.println("TicketCost: "+t.getTotalBookingCost());
	}

	
}
