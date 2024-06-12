package collectionINJava;
import java.util.*;
import java.util.Map.Entry;

public class treemap {
    public static void main(String[] args) {
        // TODO code application logic here
        //key is integer, value is string
         TreeMap<Integer,String> tm = new TreeMap<>(Map.of(11,"dd", 22,"hh",5,"jj"));
         TreeMap<Integer,String> tm1 = new TreeMap<>(Map.of(1,"h", 6,"f",5,"u"));
         //System.out.println(tm1);  
        // tm.put(5, "3");
          System.out.println(tm);  
          //tm1.putAll(tm);
          //ceiling entry means value close or equal to key value given
          System.out.println(tm1.ceilingEntry(4));
          System.out.println(tm1.ceilingEntry(4).getValue());
           System.out.println(tm1.descendingKeySet());
            System.out.println(tm1.entrySet());
             System.out.println(tm1.get(2));
              System.out.println(tm1.headMap(5));
               System.out.println(tm1.firstEntry().getKey());
                System.out.println(tm1.firstEntry().getValue());
                System.out.println(tm);
                tm1.putAll(tm);
                System.out.println(tm1);
                for(int key : tm1.keySet()) {
                	System.out.println(key);
                }
                System.out.println("-------------------------");
                
                for(Integer key : tm1.keySet()) {
                	System.out.println(key);
                }
                System.out.println("-------------------------");
                for (String s : tm1.values()) {
                	System.out.println(s);
                }
                System.out.println("-------------------------");
                for(Map.Entry<Integer,String>  m : tm1.entrySet()) {
                	System.out.println(m.getKey() + " "+ m.getValue());
                }
                System.out.println("-------------------------");
                Set<Map.Entry<Integer, String>> m = tm1.entrySet();
                System.out.println(m);
                System.out.println("-------------------------");
                tm1.put(60, "kk");
                for(var x : m) {
                	 System.out.println(x);	
                }
                System.out.println("-------------------------");
                Object ob = tm1.clone();
                System.out.println(ob);
                System.out.println("-------------------------");
              HashMap<Integer,String> mp = new HashMap<>(Map.of(1,"hi",2,"hllo"));
              
              
         
    }

}
