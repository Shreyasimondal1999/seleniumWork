package collectionINJava;
import java.lang.*;
import java.util.*;

public class hashSet {
public static void main(String rgs[]) {
	HashSet<String> hs = new HashSet<String>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter input");
	hs.add("hello");
	hs.add("i");
	hs.add("all");
	System.out.println(hs);
	List<String> al1 = new ArrayList<String>(hs);
	Collections.sort(al1);
	System.out.println(al1);
	Collection<Integer> hs1 = new HashSet<Integer>();
	Collection<Integer> hs2 = new LinkedHashSet<Integer>();
	HashSet<Integer> hs3= new LinkedHashSet<>();
	LinkedHashSet<Integer> hs4 = new LinkedHashSet<>();
	Set<Integer> c  = new HashSet<>(hs3);	
	
	
	
}

}
