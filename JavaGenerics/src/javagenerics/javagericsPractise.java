package javagenerics;
class genericsdemo<T>{
	T data;
	public void setData(T v) {
		data = v;
	}
	public T getData() {
		return data;
	}
}
class MyArray<T>{
	
	T a[] = (T[]) new Object[5];
	int length = 0;
	public void append(T v) {
		a[length++] = v;
	}
	public void display() {
		for (T x : a) {
			System.out.println(x);
		} 
	}
	
}
public class javagericsPractise {
	//GENERIC METHOD
	static <E> void show(E[] list) {
		 
	}
public static void main(String args[]) {
	Object ob[] = new Object[5];
	ob[0]="hi";
	ob[1]=10;
	ob[2] = "world";
	ob[3] = 2.34f;
	ob[4] = 99.99d;
	//generic object of type String
	genericsdemo<String> g = new genericsdemo<String>();
	g.setData("hello");
	System.out.println(g.getData());
	genericsdemo<Integer> h = new genericsdemo<Integer>();
	h.setData(10);
	System.out.println(h.getData());
	MyArray<Integer> ma = new MyArray<Integer>();
	ma.append(10);
	ma.append(20);
	ma.append(30);
	ma.append(40);
	ma.append(50);
	ma.display();

}
}
