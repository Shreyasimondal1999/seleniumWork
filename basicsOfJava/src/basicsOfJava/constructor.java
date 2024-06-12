package basicsOfJava;
class Rectangl
{
    int length;
    int breadth;
    
    Rectangl()
    {
        length=breadth=1;
    }
    Rectangl(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int area() {
    	return this.length* this.breadth;
    }
   
}
 

public class constructor {
    public static void main(String[] args) {
        // TODO code application logic here
             Rectangl r1 = new Rectangl();
             System.out.println(r1.area());
    }
}
