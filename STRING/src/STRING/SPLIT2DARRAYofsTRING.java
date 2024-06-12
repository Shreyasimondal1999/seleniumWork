package STRING;
import java.util.*;
public class SPLIT2DARRAYofsTRING {
public static void main(String args[]) {
	/*Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String[] items = new String[n];
    double[] discounts = new double[n];

    double minDiscount = Double.MAX_VALUE;
    for(int i=0; i<n; i++){
        items[i] = sc.next();
        discounts[i] = (Double.parseDouble(items[i].split(",")[2])/100)*Double.parseDouble(items[i].split(",")[1]) ;
        if(discounts[i] < minDiscount)
            minDiscount = discounts[i];
    }
    sc.close();

    for(int i=0; i<n;i++){
        if(discounts[i] == minDiscount)
            System.out.println(items[i].split(",")[0]);
    }*/
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); sc.nextLine();
    String input1[][] = new String[n][3];
    
    for(int i=0;i<n;i++){
      input1[i] = sc.nextLine().split(",");
      }
      
      int discount[] = new int[n];
      for(int i=0;i<n;i++){
        discount[i] = (Integer.parseInt(input1[i][1])*Integer.parseInt(input1[i][2])/100);
      }
      
      int min=9999;
      for(int i=0;i<n;i++){
        if(min>discount[i]) min=discount[i];
      }
      
      for(int i=0;i<n;i++){
        if(min==discount[i]) System.out.print(input1[i][0]+" ");
      }
}
}
