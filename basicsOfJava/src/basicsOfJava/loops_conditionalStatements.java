package basicsOfJava;
import java.util.*;
import java.lang.*;


public class loops_conditionalStatements {
	public static void main(String[] args) {
//checking is a year is leap year
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the year");
	int num = sc.nextInt();
	
	 if(num%4==0) {
		 if(num%100==0) {
			if(num%400!=0) {
				System.out.println("this is not leapyear");
			}else {
				System.out.println("this is a leap year");
			} 
		 }
		 else {
			 
			 System.out.println("this is a leap year");
		 }
	 }
	 else {
		 System.out.println("not a leapyear");
	 }
	 
	 System.out.println("switch case: ");
	 int flag = 1;
	 while(flag==1) {
		 //switch case
		 System.out.println("enter the day input: ");
		 int  day = sc.nextInt();
		 switch(day){
			 case 1 : System.out.println("day "+ day);
			 break;
			 case 2 : System.out.println("day "+ day);
			 break;
			 case 3: System.out.println("day "+ day);
			 break;
			 case 9: System.out.println("day "+ day);
			 break;
			 default: System.exit(0);
			 break;
		 } 
		 
	 }
	 
	 //multiplying two matrices
	 System.out.println("matrix multiplication is: ");
	   int A[][]={{3,5,9},{7,6,2},{4,3,5}};
       int B[][]={{1,0,0},{0,1,0},{0,0,1}};
       
       int C[][]=new int[3][3];
       
       
       
       
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               C[i][j]=0;
               for(int k=0;k<3;k++)
               {
                   C[i][j]=C[i][j]+A[i][k]*B[k][j];
               }
           }
       }
       
       for(int x[]:C)
       {
           for(int y:x)
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
      		 
	 }
}
