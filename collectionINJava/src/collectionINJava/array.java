package collectionINJava;
import java.util.*;
public class array {
public static void main(String args[]) {
	String arr[][] = new String[2][3];
	String s[]= new String[3]; 
	Scanner sc =new Scanner (System.in);
	System.out.println("enter input");
	
	//for(int i = 0; i< 2; i++) {
//		arr[i]=sc.nextLine().split(",");
//	}

//	for(int x = 0; x<2;x++) {
//		for(int y = 0; y< 3;y++) {
//			System.out.print(arr[x][y]);
//		}
//		System.out.println();
//	}
	
		
	s=sc.nextLine().split(",");
    
	for(int i = 0; i< 3; i++) {
System.out.println(s[i]);

    }	
	
}

}
