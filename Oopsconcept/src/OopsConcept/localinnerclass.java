package OopsConcept;
abstract class my{
abstract void meth();
}
class outerr{
int x = 10;
//anonymus inner class
//An anonymous inner class is an inner class that does not have a name. It is created and declared in the same place as it is used.
my call =new my(){
@Override
void meth(){
System.out.println("hi " + x);
}
};
 
 
void display(){
call.meth();
int g = 99;
my m = new my()//local anonymus inner class inheriting from class my
{
@Override
void meth(){
System.out.println("hi " + g);
}
};
m.meth();
    
 
//local inner class
class innerr{
int y = 100;
void show(){
System.out.println(y);
}
}
innerr i = new innerr();
new innerr().show();//anonymus object, object with no reference creation
i.show();
}
}
public class localinnerclass {
	 public static void main(String[] args) {
	        // TODO code application logic here
	        outerr o = new outerr();
	        System.out.println(o.x);
	        o.call.meth();
	        o.display();
	        
	    }
}
