package basicsOfJava;

import java.util.Scanner;

public class Strings{

	    public static void main(String[] args) {
	    	//literals
	        byte b1=10;
	        byte b2=0b1010;
	        byte b3=012;
	        byte b4=0X9;
	        
	        System.out.println(b1);
	        System.out.println(b2);
	        System.out.println(b3);
	        System.out.println("b4 :" + b4);
	        //literals
	        long l=9999999999L;
	        float f=12.56f;
	        double d=12.56d;
	        
	        System.out.println(l);
	        System.out.println(f);
	        System.out.println(d);
	        
            // '.'  matches anything
	        String str1="f";
	        System.out.println(str1.matches("."));
	        
	        String str2="a";
	        //matches exactly anything in the given string, but only one char
	        System.out.println(str2.matches("[abc]"));
	        //matches anything except the given string
	        String str3="p";
	        //true for alphabets other than abc
	        System.out.println(str3.matches("[^abc]"));
	        
	        String str5="7";
	       //matches range but there is 'or' between ranges
	        System.out.println(str5.matches("[a-zA-Z0-9]"));//[a-z][0-9]*/
	        // matches a or b
	        String str6="YE";
	        System.out.println("YES OR NO"+str6.matches("YES|NO"));
	     // matches any digit among 0 to 9  and any alphabets,  but only one
	        String str7="b";
	        System.out.println(str7.matches("\\w"));
	     // matches any digit among 0 to 9  but only one.
	        String str8="9";
	        System.out.println(str8.matches("\\d"));
	        // matches  digit, but only one.
	        String str4="o";
	        System.out.println(str4.matches("\\D"));
	        //matches  alphabet, but only one.
	        String str9="b";
	        System.out.println(str9.matches("\\W"));
	        // reg ex matching 
	        String str10="abcdef";//ab6cdef,abBcdef
	        System.out.println(str10.matches("[abc]*"));//matches any number of a or b or c
	        String str11="accbdefg";//accb
	        //{x,y} between x and y times given charecters should appear
	        System.out.println(str11.matches("[abc]{3,7}"));
	        
	        String str12="john@gmail.com";
	        System.out.println(str12.matches(".*gmail.*"));
	        System.out.println(str12.matches("\\w*@gmail(.*)"));
	        //? contains o or 1 time
	        String str14= "j";
	        
	        System.out.println(str14.matches("j?"));
	        
	        
// replacing all the special charecters in a string 
	        String st = "9 73 42r4g^849 8^^& *&^9";
	       System.out.println( st.replaceAll("[^a-zA-Z0-9\\s]",""));
	       
	       //removing extra spaces from a srting , and no spaces in the begining and ending of the string
	       
	       String sd = "       asd   dfdg      lkh     ";
	       System.out.println(sd.replaceAll("[\\s]+", " ").trim());
	       
	       
	       
	       // find number of words in a string
	       // count words by identifying the spaces 
	       String stringg = sd.replaceAll("[\\s]+", " ").trim();
	       
	       String words[] = stringg.split("[\\s]", 2);
	       for(int i = 0; i< words.length; i++) {
	    	   System.out.println(words[i]);
	    	   
	       }
	        
	        int num = words.length;
	        System.out.println(num);
	        
	        //find the type of website and the protocol used
	        
	        Scanner sc = new Scanner(System.in);
//	        System.out.println("enter the url");
//	        String URL = sc.next();
//	        String protocol = URL.substring(0,URL.indexOf(":")); 
//	        if(protocol.equals("http")) {
//	        	System.out.println("Hypertext protocol");
//	        }else if(protocol.equals("ftp")) {
//	        	System.out.println("Hypertext protocol");
//	        }
//	        else
//	        	System.out.println("not known protocol");
//	        
//	        String extension = URL.substring(URL.lastIndexOf(".")+1);
//	        
//	        System.out.println(extension);
	        System.out.println("name validation:");
	        String name = sc.nextLine();
	        System.out.println(name);
		 System.out.println(name.matches("[A-Za-z\\s]+"));
		  System.out.println("NAme valiidation");
		  String regex = "[A-Za-z\\s]{10,30}";
		  String reg1= "[A-za-z][\\d]{5,5}";
		  System.out.println(name.matches(reg1));
	
	        }	
	    
}
