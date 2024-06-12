package lambdaPractise;
class Super{
	void meth1() {
		
	}
}
class sub extends Super{
	void meth2() {
		
	}
	
}
interface MyLambda{
	public void display();
}
interface MyLambda1{
	public void display(int a);
}
/*class My implements MyLambda{
	public void display() {
		System.out.println("hello World");
	}
}*/
class useLambda{
	public void callLambda(MyLambda ml) {
		ml.display();
	}
}
class Demo{
	public void method1() {
		useLambda u = new useLambda();
		u.callLambda(()->{System.out.println("hello");});
	}
}
public class lambdamethod {
	//sub s = new Super();
	static int count1 = 9;
	public static void main(String arg[]) {
		//anonymous inner class
		MyLambda m = new MyLambda() {
			public void display() {
				System.out.println("hello World1");
			}
		};
		//lambdaExpression defining the display method only 
		// lambda method is called anonymous method
		// in lambda exression we do not have to create the object, directly override the single method.
		MyLambda m1 = ()-> {
				System.out.println("hello World");
		};
		int count=2;// this variable is effectively final
		//count++;//cannot modify count as it is inside the lambda expression
		MyLambda1 m2 = (int a )->{
			System.out.println(count);
			count1++;// instance variable can be accessed
			System.out.println(a);
		};
		System.out.println(count);
		m.display();
		m1.display();
		m2.display(0);
		Demo d = new Demo();
		d.method1();
		
	}

}
