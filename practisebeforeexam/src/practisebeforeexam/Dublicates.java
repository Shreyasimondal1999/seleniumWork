package practisebeforeexam;
import java.util.*;
public class Dublicates {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 digit:");
		int arr[] = new int[3];
		for(int i =0;i< 3;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		List<Integer> l = new ArrayList<>();
		for(int i =0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				if(arr[i]==arr[j]) {
					l.add(arr[i]);
				}
				else {
					continue;
				}
			}
		}
		System.out.println(l);
	int flag=0;	
	for(int j =0; j<3;j++) {
		for(int i = 0; i<l.size();i++) {
			if(arr[j]==l.get(i)) {
				
				flag=1;
				System.out.println("Flag:"+flag);
			}
		}
		if(flag!=1) {
			sum= sum+arr[j];
		}
		flag=0;
	}
	System.out.println(sum);


	}

}
