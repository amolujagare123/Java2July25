package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("Ravi");
        lhs.add("Vijay");
        lhs.add("Ajay");
        lhs.add("Anuj");
        lhs.add(null);
        lhs.add(10);

        System.out.println(lhs.add("Anuj"));
        System.out.println(lhs);
    }
}