package practisebeforeexam;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FantasyIceScoops {
	private Map<String,Integer> IceCreamMap =new HashMap<String,Integer>();
	 
	public Map<String, Integer> getIceCreamMap() {
	return IceCreamMap;
	}
	 
	public void setIceCreamMap(Map<String, Integer> IceCreamMap) {
	this.IceCreamMap = IceCreamMap;
	}
	 
	public List<String> filterIceCreamDetailsForGivenPriceRange(int start,int end)
	{
	//fill the code
	List<String> res = new ArrayList<>();
	for(Map.Entry<String,Integer> m : IceCreamMap.entrySet()) {
		if(m.getValue()>start && m.getValue()<end) {
			res.add(m.getKey());
		}
	}
	

	return res;
	}
	 
	public Map<String,Integer> findTheCheapestIceCream()
	{
	//fill the code
	Map<String,Integer> cheapMap = new HashMap<>();
	int cheap = 100000;
	for(Map.Entry<String, Integer> m : IceCreamMap.entrySet()) {
		if(m.getValue()<cheap) {
			cheap = m.getValue();
		}
	}
	for(Map.Entry<String, Integer> m : IceCreamMap.entrySet()) {
		if(m.getValue()==cheap) {
			cheapMap.put(m.getKey(), m.getValue());
		}
	}

	return cheapMap;
	}
	 
	public static void main(String args[])
	{
	//dont change the code
	Scanner sc=new Scanner(System.in);
	FantasyIceScoops c=new FantasyIceScoops();
	Map<String,Integer> cMap = new HashMap<String,Integer>();
	System.out.println("Enter the number of IceCream details to be added ");
	int n=sc.nextInt();
	System.out.println("Enter the IceCream details(IceCreamName:Price)");
	String [] icecreamDetails = new String[n];
	for(int i=0;i<n;i++)
	{
	icecreamDetails[i] = sc.next();
	}
	 
	for(int i=0;i<icecreamDetails.length;i++)
	{
	String[] a = icecreamDetails[i].split(":");
	cMap.put(a[0], Integer.parseInt(a[1]));
	}
	c.setIceCreamMap(cMap);
	 
	System.out.println("Enter a range to filter the IceCream details.");
	int start=sc.nextInt();
	int end=sc.nextInt();
	 
	List<String> list1=c.filterIceCreamDetailsForGivenPriceRange(start,end);
	if(list1.size()>0)
	{
	System.out.println("IceCream available within the price range $."+start+" and $."+end+" are");
	for(int i=0;i<list1.size();i++){
	System.out.println(list1.get(i));
	}
	}else
	{
	System.out.println("No IceCream available within the price range $."+start+" and $."+end);
	}
	 
	System.out.println("The IceCream with the lowest price is");
	 
	Map<String,Integer> pop=c.findTheCheapestIceCream();
	for(Map.Entry<String,Integer> entry:pop.entrySet())
	{
	System.out.println(entry.getKey()+ " - $."+entry.getValue());
	}
	 
	 
	}
}

