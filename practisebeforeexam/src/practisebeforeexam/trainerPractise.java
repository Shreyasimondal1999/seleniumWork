package practisebeforeexam;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class trainerPractise {
	public static void main(String[] args) throws Exception{
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    LocalDate datetime = LocalDate.parse("2020-05-09", pattern);
		System.out.println(datetime); 
     	String sDate1="31/12/1998";  
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
        System.out.println(sDate1+"\t"+date1);  
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 65000);  
        map.put("HP", 20000);  
        map.put("Dell", 32000);  
        map.put("Asus", 21478);  
        map.put("Samsung", 36546);  
        map.put("Lenovo", 19990);  
        System.out.println(map);
        //convert a map to another map based on ascending order of values
        //convert HashMap into List   
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());  
        //sorting the list elements  based on their values
        Collections.sort(list, (o1,o2)->o1.getValue().compareTo(o2.getValue()));  
        //convert list to a map
        Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();  
        for (Entry<String, Integer> entry : list)   
           map1.put(entry.getKey(), entry.getValue());  
        System.out.println(map1);

        //convert a map to another map based on ascending order of keys
        Map<String, Integer> map2 = new TreeMap<>(map);
        System.out.println(map2);

	}
}

 
