package collectionINJava;
import java.util.*;
public class linkedHashSet {
public static void main(String args[]) {
	Set<Integer> s = new LinkedHashSet<>(Set.of(1,2,3,4,5,6,7,8,10));
	System.out.println(s.toString());
	s.add(11);
	Set<Integer> s1 = new HashSet<>(Set.of(1,56,34,23));
	s.addAll(s1);
	System.out.println(s);
	s.remove(11);
	s.remove(23);
	System.out.println(s);
	//System.out.println(s.removeAll(s1));
	System.out.println(s);
	System.out.println(s.retainAll(s1));
	System.out.println(s);
	System.out.println(s.containsAll(s1));
	System.out.println(s.equals(s1));
	List<Integer> l = new ArrayList<>(s);
	System.out.println(s);
	System.out.println(l);
	Collections.sort(l);
	Set<Integer> k = new LinkedHashSet<>(l);
	System.out.println(k);
}
}
