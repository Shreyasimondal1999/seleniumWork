package practisebeforeexam;
import java.util.*;
import java.text.*;
public class uniqueNumber{
   
    public static void main(String args[])
    {
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        j = UserMain.getUnique(n);
        if(j==-1){
        System.out.println("Not Unique");
        }
        else if(j==1){
        System.out.println("Unique");
        }
      
    }
}
 

class UserMain {
   
    public static int getUnique(int num) {
        //fill the code
    	int count = 0;
    	if(num>0) {
    		int arr[] = new int[1000];
    		int i = 0;
    		
    		while(num!=0) {
    		arr[i]=num%10;	
    		//System.out.println("num:"+arr[i]);
    		i++;
    		num = num/10;
    		}
    		
    		for(int j = 0;j<i-1;j++) {
    			for(int k = j+1;k<i-1;k++) {
    				if(arr[j]==arr[k]) {
    					System.out.println("num arr[j] arr[k]:"+arr[j]+" "+arr[k]);
    					count = count+1;
    				}
    			}
    		}
    		System.out.println("Count:"+count);
    		
    		if(count>0) {
    			System.out.println("Count:"+count);
    			count = -1;
    			return count;
    		}
    		else {
    			count = 1;
    			return count;
    		}
   		}
    	count = -1;
    	return count;

    	
   
    }
   
}
