package STRING;

public class stringmethods {
	static {
		
	}
	
	public static void main(String args[]) {
		 String s = "JavaProgramming";
		 String s1 = "KAva";
		 System.out.println(s.compareTo(s1));
		 System.out.println(s.contentEquals("Java"));
		
		System.out.println(s.replace("Pro","ProMax"));
	}
	

}
