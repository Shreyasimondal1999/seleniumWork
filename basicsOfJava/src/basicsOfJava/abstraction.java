package basicsOfJava;


abstract class Super{
Super(){
System.out.println("super constructor;");
}
abstract void superclassmethod();
}
class subclass extends Super{
subclass(){
System.out.println("subclass constructor");
}
void superclassmethod(){
System.out.println("overridden super class method");
}
}
public class abstraction {
	public static void main(String[] args) {
        // TODO code application logic here
        //Super s = new Super(); this is not allowed
        subclass m = new subclass();
        m.superclassmethod();
        
        System.out.println("----------------");
        Super s = new subclass();
        s.superclassmethod();
    }
}