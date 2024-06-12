package practisebeforeexam;
import java.util.*;
import java.util.Map.Entry;

class UserMainCode{
	public static int sizeOfResultAndHashMap(HashMap<Integer,String> m) {
		System.out.println("outloop");
		Map<Integer,String> map = new HashMap<Integer,String>();
		for(Map.Entry<Integer, String> mp : m.entrySet()) {
			System.out.println("outif");
			if(mp.getKey()%4!=0) {
				System.out.println("inif");	
				int key = mp.getKey();
				System.out.println("Key:"+mp.getKey());
				String val = mp.getValue();
				map.put(key, val);
				//m.remove(key);
			}
		}
		int size = map.size();
		
		return size;
	}
}
public class removingKeyfromHashMap {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of input");
	int size = sc.nextInt();
	HashMap<Integer,String> hm = new HashMap<>();
	for(int i = 0; i<size; i++) {
		int key = sc.nextInt();
		sc.nextLine();
		String Value = sc.nextLine();
		hm.put(key, Value);
	}
	
	System.out.println(hm);
	System.out.println(UserMainCode.sizeOfResultAndHashMap(hm));
}
}
