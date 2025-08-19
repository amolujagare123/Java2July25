package CollectionsDemo.Maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap3 {

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

        System.out.println(lhm.get(114));
        lhm.remove(114);

        System.out.println("lhm="+lhm);

        System.out.println(lhm.containsKey(112));

        System.out.println(lhm.containsValue("Rajveer1"));

        Set s = lhm.keySet();
        System.out.println("set="+s);

       Collection v = lhm.values();
        System.out.println("values="+v);

        Set entrySet = lhm.entrySet();
        System.out.println("entrySet="+entrySet);


    }
}
