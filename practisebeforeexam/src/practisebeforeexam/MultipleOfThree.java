package practisebeforeexam;
import java.util.*;
public class MultipleOfThree {

	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> al) {
	        
	        //fill the code
	        
//	        ArrayList<Integer> result = new ArrayList<>();
//	        for (int i=0;i<al.size();i++){
//	            if((i + 1) % 3 != 0){
//	                result.add(al.get(i));
//	            }
//	        }
	    	ArrayList<Integer> l1= new ArrayList<>();
	    	int j = 1;
	    	for(int i =0;i<al.size();i++) {
	    		if(i!=(3*j-1)) {
	    			//j++;
	    			l1.add(al.get(i));
	    		}
	    		else {
	    			j++;
	    		}
	    	}
	    	return l1;

	        //return result;
	    }
public static void main(String ars[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter");
	    ArrayList<Integer> al=new ArrayList<Integer>();
	    int len=sc.nextInt();
	    for(int i=0;i<len;i++)
	    {
	    al.add(sc.nextInt());
	    }
	   
	    al=removeMultiplesOfThree(al);
	   
	    for(int a:al) {
	    System.out.println(a);
	    }
//	List<Integer> l1= new ArrayList<>();
//	int j = 1;
//	for(int i =1;i<=size;i++) {
//		if(i!=3*j) {
//			j++;
//			l1.add(l.get(i));
//		}
//	}
//	System.out.println("OUPUT");
//	
//	for(int i = 0;i<size;i++) {
//		System.out.println(l1.get(i));
//	}
	
	
	
}
}
