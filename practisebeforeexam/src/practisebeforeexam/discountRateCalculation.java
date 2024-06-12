package practisebeforeexam;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Map.Entry;

class discountRateCalculation {
	public static List<String> discountCalculation(Map<String,String> dorMap,Map<String,Integer> salMap) {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d1 = LocalDate.parse("01-01-2015", d);
		LinkedHashMap<String,LocalDate> newdorMap= new LinkedHashMap<>();
		for(Map.Entry<String, String> m : dorMap.entrySet()) {
			LocalDate d2 = LocalDate.parse(m.getValue(),d);
			newdorMap.put(m.getKey(), d2);
		}
		
		List<String> l = new ArrayList<String>();
		for(Map.Entry<String, LocalDate> m : newdorMap.entrySet()) {
			Period p = Period.between( m.getValue(),d1);
			double discount = 0;
			if(salMap.get(m.getKey())>=20000 && p.getYears()>=5) {
				System.out.println("c1"+m.getKey()+" "+p.getYears()+" "+salMap.get(m.getKey()));
				discount = salMap.get(m.getKey())*0.20;
				System.out.println(discount);
			}
			else if(salMap.get(m.getKey())>=20000 && p.getYears()<5) {
				System.out.println("c2"+m.getKey()+" "+p.getYears()+" "+salMap.get(m.getKey()));
				discount = salMap.get(m.getKey())*0.10;
				System.out.println(discount);
			}
			else if(salMap.get(m.getKey())<20000 && p.getYears()>=5) {
				discount = salMap.get(m.getKey())*0.15;
				System.out.println("c3"+m.getKey()+" "+p.getYears()+" "+salMap.get(m.getKey()));
				System.out.println(discount);
			}
			else if(salMap.get(m.getKey())<20000 && p.getYears()<5) {
				discount = salMap.get(m.getKey())*0.05;
				System.out.println("c3"+m.getKey()+" "+p.getYears()+" "+salMap.get(m.getKey()));
				System.out.println(discount);
			}
			else {
				return l;
			}
			l.add(m.getKey().concat(":").concat(String.valueOf(discount)));
		}
		return l;
		
		
	}
public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the no of inputs:");
	int no = sc.nextInt();
	System.out.println("enter the account holder details:");
	LinkedHashMap<String,String> dorMap = new LinkedHashMap<>();
	LinkedHashMap<String,Integer> salMap= new LinkedHashMap<>();
	for(int i =0; i< no ; i++) {
		sc.nextLine();
		String id = sc.nextLine();
		//System.out.println("----------------");
		dorMap.put(id, sc.nextLine());
		//System.out.println("----------------");
		salMap.put(id, sc.nextInt());
		//System.out.println("----------------");
	}
	List<String> l = discountCalculation(dorMap,salMap);
	for(String s : l) {
		System.out.println(s);
	}
	
	
}
}
