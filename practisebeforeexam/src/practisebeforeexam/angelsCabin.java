package practisebeforeexam;
import java.util.*;
import java.util.Map.Entry;
public class angelsCabin {
	private Map<String , Integer> orderMap = new HashMap<>();
	public Map<String , Integer> getOrdermap(){
		return orderMap;
	}
	
	public void setOrderMap(Map<String,Integer> orderMap) {
		this.orderMap = orderMap;
	}
	public int findTotalcountOfBouquetSoldBasedOnTheGivenRange(int startrange, int endRange) {
		int countoforder=0;
		for(Map.Entry<String,Integer> m : orderMap.entrySet()) {
			if(m.getValue()>= startrange && m.getValue()<=endRange ) {
				countoforder = countoforder+m.getValue();
			}
		}
		if(countoforder<=0) {
			return -1;
		}
		return countoforder;
		
	}
	public List<String> findOrderIdBasdOnBouquetSold()
	{ 
		List<String> l = new ArrayList<>();
		for(Map.Entry<String,Integer> m : orderMap.entrySet()) {
			if(m.getValue()>= 500 ) {
			l.add(m.getKey());
			}
		}
		return l;
		
	}	
	
	public static void main(String args[]) {
		angelsCabin ac = new angelsCabin();
		List<String> l = new ArrayList<>();
		Map<String,Integer>  mp = new HashMap<>();
			Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of orders to be added:");
		int n = sc.nextInt();
		System.out.println("Enter the orders:");
		String s[] = new String[n];
		for(int i = 0; i< n;i++) {
			s[i] = sc.next();
			
		}
		
		for(int i = 0; i<n;i++) {
			String data[] = s[i].split(":");
			mp.put(data[0], Integer.parseInt(data[1]));
			ac.setOrderMap(mp);
		}
		System.out.println("Enter the start and end count");
		int startCount = sc.nextInt();
		int endCount = sc.nextInt();
		int count = ac.findTotalcountOfBouquetSoldBasedOnTheGivenRange(startCount, endCount);
		System.out.println("count:"+count);
		l = ac.findOrderIdBasdOnBouquetSold();
		if(l.size()>=1) {
			System.out.println(l);
		}
		}
	
	
	
	
	
	
	
	
	

}
