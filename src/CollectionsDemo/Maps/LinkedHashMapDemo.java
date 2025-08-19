package CollectionsDemo.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();

        hm.put(106, "Nikhil");
        hm.put(115, "Rajveer");
        hm.put(107, "Arif");
        hm.put(109, "Paresh");
        hm.put(108, "Kailash");
        hm.put(110, "Vivek");
        hm.put(113, "Dharmendra");
        hm.put(111, "Akshay");
        hm.put(114, "Sudhagya");
        hm.put(112, "Jignesh");




        // Print the map
        System.out.println(hm);
    }
}
