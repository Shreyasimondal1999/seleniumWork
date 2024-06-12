package collectionINJava;


import java.util.ArrayList;
import java.util.List;
 
public class snowyClass {
 
    public static void main(String[] args) {
        List<String> packingList = generatePackingList();
        
        System.out.println("Packing List for Snowy Getaway:");
        for (String item : packingList) {
            System.out.println("- " + item);
        }
    }
 
    public static List<String> generatePackingList() {
        List<String> packingList = new ArrayList<>();
 
        // Essentials
        packingList.add("Warm jacket");
        packingList.add("Winter boots");
        packingList.add("Hat, gloves, and scarf");
        packingList.add("Thermal underwear");
 
        // Snow activities gear
        packingList.add("Snowboard/skis");
        packingList.add("Snowshoes");
        packingList.add("Snow goggles");
        packingList.add("Hand warmers");
 
        // Other necessities
        packingList.add("Portable charger");
        packingList.add("First aid kit");
        packingList.add("Snacks and water");
 
        return packingList;
    }
}