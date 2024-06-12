package collectionINJava;

import java.util.*;

import java.lang.*;
 

 



public class HelMetShowroom {
	
	 public static void main(String[] args) {
	        HelmetShowroom1 showroom = new HelmetShowroom1();
	 
	        // Adding helmets to the showroom
	        showroom.addHelmet(new Helmet1("Bell", "Qualifier DLX", 199.99));
	        showroom.addHelmet(new Helmet1("Shoei", "RF-1200", 589.99));
	        showroom.addHelmet(new Helmet1("AGV", "K6", 549.95));
	 
	        // Displaying helmets in the showroom
	        List<Helmet1> helmets = showroom.getHelmets();
	        System.out.println("Helmets available in the showroom:");
	        for (Helmet1 helmet : helmets) {
	            System.out.println(helmet);
	        }
	    }
}

 
