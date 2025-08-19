package CollectionsDemo.Maps;

import java.util.LinkedHashMap;

public class LinkedHashMapPutALL {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(106, "Nikhil");
        lhm.put(115, "Rajveer");
        lhm.put(107, "Arif");
        lhm.put(109, "Paresh");
        lhm.put(108, "Kailash");
        lhm.put(110, "Vivek");
        lhm.put(113, "Dharmendra");
        lhm.put(111, "Akshay");
        lhm.put(114, "Sudhagya");
        lhm.put(112, "Jignesh");

        // Print the map
        System.out.println("lhm="+lhm);

        LinkedHashMap<Integer,String> lhm2 = new LinkedHashMap<>();

        System.out.println("lhm2="+lhm2);

        lhm2.putAll(lhm);

        System.out.println("lhm2="+lhm2);


    }
}
