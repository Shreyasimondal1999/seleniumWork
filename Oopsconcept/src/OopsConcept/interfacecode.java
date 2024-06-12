package OopsConcept;

class Phone
{
	private String s; 
	public Phone(String s1){
		super();
		s=s1;
	}
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}
 
interface ICamera
{
    void click();
    void record();
}
 
interface IMusicPlayer
{
    void play();
    void stop();
}
 
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }
 
}

public class interfacecode {
	static void stringnamechanging(String str) {
		str="kitty";
	}
	  public static void main(String[] args) {
	        // TODO code application logic here
	        SmartPhone sp=new SmartPhone();
	        IMusicPlayer s= new SmartPhone();
	        Phone p = new SmartPhone();
	        ICamera c = new SmartPhone();
	       // ICamera c1= new Phone();// not possible
	sp.play();
	        sp.stop();
	        sp.call();
	sp.click();
	//s.click(); this cannot be done
	String str =new String("hello");
	stringnamechanging(str);
	System.out.println(str);
	Phone p1 = new Phone(str);
	
	
	
	    }
	    

}