package practisebeforeexam;
import java.util.*;
public class larestSpan {
	public static int getLargestSpan(int []arr) {
		int span = 0;
		int size = arr.length;
		int temparr[] = new int[size];	
		int count=0;
		for(int i = 0; i < size ; i++){
			int ele = arr[i];
			for(int j = i+1;j<size; j++) {
				if(ele==arr[j]) {
					//System.out.println("ele:"+ele);
					//System.out.println("arr[j]:"+arr[j]);
					temparr[count++]=ele;
				}
			}
		  }
		for(int i = 0; i<temparr.length;i++) {
			System.out.println(temparr[i]);
		}
		int maxCount=0;
		int firstIndex=0;
		int lastIndex=arr.length;
		
		for(int j=0;j<temparr.length;j++) {
			for(int i = 0;i<size;i++) {
				if(temparr[j]==arr[i]&&firstIndex==0) {
					firstIndex=i;
				}
			}
			for(int i = 0;i<size;i++) {
				if(temparr[j]==arr[i]) {
					lastIndex=i;
				}
			}
			if((lastIndex-firstIndex+1)>maxCount) {
				maxCount=lastIndex-firstIndex+1;
			}
		}

		/*int a = 0;
		int tempar[]= new int[size];
		for(int i = 0;i<size-1;i++) {
		for(int j = i; j<size;j++) {
			if(arr[i]==arr[j]) {
				int count1 = j-i+1;
				tempar[a++]=count1;
			}
		}
		}
		int max =0;
		for(int i =0;i<size;i++) {
			if(max<tempar[i]) {
				max = tempar[i];
			}
		}*/
		
		
		
		
		
		
		
				
		return maxCount;
	}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	int arr[]  = new int[size];
	sc.nextLine();
	for(int i = 0;i<size;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(getLargestSpan(arr));
}
}
