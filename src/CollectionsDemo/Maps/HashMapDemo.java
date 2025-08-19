package CollectionsDemo.Maps;

import java.util.Date;
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(101, "Amol");
        hm.put(102, "Vaishali");
        hm.put(103, "Rachita");
        hm.put(104, "Sreeja");
        hm.put(105, "Prakash");

        // Heterogeneous entries (different types of key-value pairs)
        hm.put("id", 106);           // String → Integer
        hm.put(107, 99.99);          // Integer → Double
        hm.put(108, true);           // Integer → Boolean
        hm.put(109, 'A');            // Integer → Character
        hm.put(110, new Date());     // Integer → Object (Date)

        // Print the map
        System.out.println(hm);
    }
}
