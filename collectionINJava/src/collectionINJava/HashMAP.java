package collectionINJava;
import java.util.*;
import java.util.Map.Entry;
import java.util.Map;
public class HashMAP {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<>();
		HashMap<Integer,String> hmp = new HashMap<>(Map.of(1,"hi",2,"hello",3,"bonjour",4,"hola"));
		hm.put(1, "bye");
		hm.put(5,"annyeong");
		hm.put(6,"tata");
		System.out.println(hm.get(1));
		HashMap<Integer,String> copy = new HashMap<>(Map.of(1,"see ya"));
		copy.putAll(hmp);
		System.out.println(copy);
		System.out.println(hm.containsKey(1));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.remove(1));
		System.out.println(hm.remove(1,"bye"));
		System.out.println(hmp.containsValue("hi"));
		copy.clear();
		Object o = copy.clone();
		String s = hmp.replace(1, "mou");
		System.out.println(hmp);
		System.out.println(hmp.replace(1, "mou","holas"));
		
		
	}

}
