package OopsConcept;



class Outer
{
    static int x=10;
    
    class Inner
    {
        private int l = 90;
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
     //System.out.println(y); cannot access identifier inside innner class without creating object of it
    Inner i=new Inner();
    //work of inner class is to be used by outer class
    
    public void outerDisplay()
    {
        
        i.innerDisplay(); 
        System.out.println(i.y);
        System.out.println(i.l);
        
        
    }
}
public class innerclass {
	public static void main(String[] args) {
        // TODO code application logic here
        Outer o= new Outer();
        o.outerDisplay();
        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();
    }

}
 
