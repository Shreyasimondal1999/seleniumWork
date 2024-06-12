package collectionINJava;
import java.util.*;
public class arraylistINjava {
public static void main(String args[]) {
	// initial size of the array list is 20, but it can extend on its own if needed
	ArrayList<Integer> al1 = new ArrayList<Integer>(20);
	ArrayList<Integer> al2 = new ArrayList<Integer>(10);
	ArrayList<Integer> al8 = new ArrayList<>(List.of(87, 98,345,89,321,879,6,22,68,123));
	al1.add(20);
	al1.add(0, 10);
	al2.add(30);
	al1.addAll(al2);
	System.out.println(al1);
	Object ob = new Object();
	ob = al1.clone();
	System.out.println(ob);
	//System.out.println(al2.contains(50));
	al1.equals(ob);
	System.out.println(al1.equals(ob));
	// 3 is not present in the array list therefore it return -1 
	System.out.println(al1.indexOf(3));
	ArrayList<Integer> al3 = new ArrayList<Integer>(List.of(10,200,30,400));
	al3.retainAll(al1);
	System.out.println("al3"+al3);
	al1.set(1,50);
	System.out.println(al1);
	for(int i = 0 ; i < al1.size();i++) {
		System.out.println(al1.get(i));
	}
	for(Integer x : al1) {
		System.out.println(x);
	}
	for(var x : al1) {
		System.out.println(x);
	}
	System.out.println("Using iterator");
	for(Iterator<Integer> i = al1.iterator(); i.hasNext();) {
		java.lang.Integer x = i.next();
		System.out.println(x);
		}
	//al1.sort(null);
	System.out.println("Using List Iterator to traverse bi-directionally");
	ListIterator<Integer> li = al1.listIterator(al1.size());
	ListIterator<Integer> lii = al1.listIterator(2);
	for(;li.hasPrevious();) {
		//System.out.println("Using List Iterator to traverse bi-directionally");
		java.lang.Integer x = li.previous();
		System.out.println(x);
		
	}
	System.out.println("Using List Iterator to traverse bi-directionally");
	for(;lii.hasPrevious();) {
		//System.out.println("Using List Iterator to traverse bi-directionally");
		java.lang.Integer x = lii.previous();
		System.out.println(x);
		
	}
	Collections.sort(al8);
	//Collections.max(al8);
	System.out.println("max"+Collections.max(al8));
	System.out.println("min"+Collections.min(al8));
	Collections.reverse(al8);
	System.out.println("reverse:"+al8);
	System.out.println("List 8:  "+al8);
	Collections.swap(al8,al8.indexOf(123), al8.indexOf(98));
	System.out.println(al8);
	Collections.rotate(al8, 2);
	System.out.println(al8);
	System.out.println("Freq :"+Collections.frequency(al8, 6));

}
}
