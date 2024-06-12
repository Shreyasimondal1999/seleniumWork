package practisebeforeexam;
import java.util.*;
import java.util.Map.Entry;

public class AllAboutYou {
public Map<String,String> m = new HashMap<>();
public Map<String,String> getMembermap(){
	return m;
}
public void setMemberMap(Map<String,String> memberMap) {
	this.m= memberMap;
}
public String findMemberTyoeBasedOnGivenMemberId(String memberid) {
	String s = "Invalid memberId";
	//System.out.println(memberid);
//	for(Map.Entry<String,String> m0: m.entrySet()) {
//		//System.out.println(m0.getKey());
//		if(m0.getKey().equals(memberid)) {
//		//	System.out.println(m0.getKey());	
//		s= m0.getValue();
//		}
//	}
	if(m.containsKey(memberid)) {
		s = m.get(memberid);
		}
	return s;
		
}
public List<String> findmemberidbasedonthememberType(String memberTpe){
	List<String> l = new ArrayList<>();
	//System.out.println("member"+memberTpe);
	for(Map.Entry<String,String> m0 : m.entrySet() ) {
		if(m0.getValue().equalsIgnoreCase(memberTpe)) {
			l.add(m0.getKey());
		}
	}
	
	return l;
}
public static void main(String args[]) {
	AllAboutYou a1 = new AllAboutYou();
	List<String> l = new ArrayList<>();
	Map<String, String> mp = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of records to be added:");
	int n = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the memberdetails:");
	String s[] = new String[n];
	for(int i = 0; i<n;i++) {
		s[i] = sc.nextLine();
	}
	for(int i = 0; i< n; i++) {
		String a[] = s[i].split(":");
		mp.put(a[0], a[1]);
	}
	a1.setMemberMap(mp);
	System.out.println(mp);
	System.out.println("Enter the memberId to be Searched:");
	String id = sc.next();
	sc.nextLine();
	System.out.println(a1.findMemberTyoeBasedOnGivenMemberId(id));
	System.out.println("Enter the member type to be searched:");
	String type = sc.nextLine();
	List<String> l1 = a1.findmemberidbasedonthememberType(type);
	System.out.println(l1);
	
	
	}
 


}
