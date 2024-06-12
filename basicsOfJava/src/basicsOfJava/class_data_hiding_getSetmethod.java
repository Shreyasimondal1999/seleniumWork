package basicsOfJava;
class Rectangle{
private double length;
private double breadth;
 
public double getLength(){
return length;
}
public double getBreadth(){
return breadth;
}
public void setLength(double l){
length = l;
}
public void setBreadth(double b){
breadth = b;
}
public double area(){
return (length*breadth);
}
}

public class class_data_hiding_getSetmethod {

	 public static void main(String[] args) {
	        // TODO code application logic here
	        Rectangle r = new Rectangle();
	        r.setLength(10);
	        r.setBreadth(15);
	        System.out.println(r.area());
	        System.out.println("length : " + r.getLength());
	         System.out.println("breadth : " + r.getBreadth());
	    }
}
