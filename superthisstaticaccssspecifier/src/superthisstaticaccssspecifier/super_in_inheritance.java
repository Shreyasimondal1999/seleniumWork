package superthisstaticaccssspecifier;

class Rectangle
{
    int length;
    int breadth;
    int x=10;
    static int y =25;
    
    Rectangle(int length)
    {
        this.length=length;
        //this.breadth=breadth;
    }
   
}

class Cuboid extends Rectangle
{
    int height;
    int x=20;
    
    Cuboid(int l,int b)
    {
        super(l);
        //height=h;
    }
    
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}
public class super_in_inheritance {
	public static void main(String[] args) 
    {
    
           Cuboid c=new Cuboid(10,5 );
           c.display();
           Rectangle r = new  Rectangle(20);
           System.out.println(r.x);
           //System.out.println( Rectangle.x);//Cannot make a static reference to the non-static field Rectangle.x
           System.out.println( Rectangle.y);
    }   

}

