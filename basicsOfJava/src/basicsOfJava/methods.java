package basicsOfJava;



public class methods {
	
	static int max(int x, int y ) {
		int max=0;
		if(x>y) {
			max = x;
		}
		else {
			max = y;
		}
		return max;
		}
	 int min(int x, int y ) {
		int min=0;
		if(x<y) {
			min = x;
		}
		else {
			min = y;
		}
		return min;
		}
	 void update(int x) {
		 x++;
		 System.out.println(x);
	 }
	 void updateanobject(int arr[]) {
		 arr[0]= 20;
		 
	 }
	 void updateobject(String name) {
		 System.out.println(name);
		 name = "shreyasi";
		 System.out.println(name);
		 
	 }	 
public static void main(String args[]) {
	//Static method can only call static methods
	System.out.println(max(3,5));
	methods mp = new methods();
	System.out.println(mp.min(3,5));
	int x = 5;// here x is a premitive data type not an object , to create an object we need new key word
	mp.update(x);// here value of x will not change , as it is call by value
	// but if we pass an object as an argument then the value will change as it directly changes the value of oject
	int a[]= {1,2,3,4,5};// here array a is a reference that points to the base address of the fist element of that array
	mp.updateanobject(a);
	for(int y : a) {
		System.out.println(y);
	}
	
	String naMe = new String("victor");// string is not a premitive data type, it is an object
	mp.updateobject(naMe);
	System.out.println(naMe);
	
}
}
