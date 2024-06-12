package practisebeforeexam;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Map.Entry;
class demo{
	TreeMap<Integer,Integer> calculateRevisedSalary(HashMap<Integer,String> d_o_b, HashMap<Integer,Integer> salary){
		TreeMap<Integer,Integer> tm = new TreeMap<>();
		double sal = 0;
		int sal_new=0;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate current_date = LocalDate.parse("01-09-2014",df);
		ArrayList<Integer> al = new ArrayList<>();
		for(Map.Entry<Integer,String> m : d_o_b.entrySet()) {
			int key = m.getKey();
			LocalDate birth_date = LocalDate.parse(m.getValue(),df);
			Period p = Period.between(birth_date,current_date);
//			al.add(p.getYears());
			
			if(p.getYears()>=25 && p.getYears()<=30) {
				 sal = salary.get(key);
				sal = sal + sal*0.2;
				sal_new = (int)Math.round(sal);
				
			}
			if(p.getYears()>=31 && p.getYears()<=60) {
				 sal = salary.get(key);
				sal = sal + sal*0.3;
				sal_new = (int)Math.round(sal);
				
			}
			
			tm.put(m.getKey(), sal_new);
			
		}
		//System.out.println("Age list:"+al);
		return tm;
	}
}
public class employeeBonus {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	HashMap<Integer,String> dob = new HashMap<>();
	HashMap <Integer,Integer> salary = new HashMap<>();
	System.out.println("Enter the input no:");
	int no = sc.nextInt();
	for(int i = 0; i< no;i++) {
		int id = sc.nextInt();
		dob.put(id, sc.next());
		salary.put(id,sc.nextInt());
	}
	demo d = new demo();
	TreeMap<Integer,Integer> tm = d.calculateRevisedSalary(dob,salary);
	System.out.println(tm);
}
}
