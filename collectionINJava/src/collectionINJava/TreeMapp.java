package collectionINJava;
import java.util.Map.*;
import java.util.*;
import java.util.Map.Entry;
public class TreeMapp {
public static void main(String args[]) {
	TreeMap<Integer,String> t = new TreeMap<>(Map.of(34,"hi",12,"hello",89,"hola",1,"annyeong"));
	System.out.println(t);
	HashMap<Integer,String> hmp = new HashMap<>(Map.of(1,"hi",2,"hello",3,"bonjour",4,"hola"));
	TreeMap<Integer,String> t1 = new TreeMap<>(hmp);
	System.out.println(t1);
	t1.putAll(t);
	System.out.println(t1);
	System.out.println(t1.putIfAbsent(1, "bye"));
	System.out.println(t1.put(100, null));
	System.out.println(t1);
	System.out.println(t1.putIfAbsent(100, "bye"));
	System.out.println(t1);
	System.out.println(t1.get(1));
	System.out.println(t1.keySet());
	System.out.println(t1.values());
	System.out.println(t1.remove(89));
	System.out.println(t1.remove(12,"helloo"));
	System.out.println(t1.replace(12, "hola"));
	System.out.println(t1.replace(12, "hello","nope"));
	System.out.println(t1);
	System.out.println(t1.lowerKey(34));
}
}
