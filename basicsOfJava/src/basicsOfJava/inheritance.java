package basicsOfJava;
class Parent
{
    public Parent(){
    System.out.println("Parent Constrcutor non parameter");
    }
    public Parent(int x)
    {
        System.out.println("Parent Constrcutor with parameter");
    }
    public Parent(String name){
    System.out.println(name);
    }
    
    public void printname() {
    	System.out.println("Name is printed");
    }
    
            
}
 
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructo1r non parameter");
    }
    public Child(int x)
    {
        System.out.println("Child Constructor2 with parameter");
    }
    public void printname() {
    	super.printname();
    	System.out.println("Name is not printed");
    }
    
}
 
class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor1 non parameter");
    }
        public GrandChild(int x)
    {
        	super(x);//calling super parameterized constructor;
        System.out.println("Grand Child Constructor2 with parameter");
    }
    public GrandChild(String name,String age){
    System.out.println("Grand Child Constructor3 with parameter");
    System.out.println(name);
    }
}

public class inheritance {
    public static void main(String[] args) {
        // TODO code application logic here
    GrandChild c=new GrandChild("kunal","9");
    GrandChild c1=new GrandChild(9);
    Child c2= new Child();
    c2.printname();
   } 
}
