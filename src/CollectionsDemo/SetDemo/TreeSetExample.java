package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("Ravi");
        ts.add("Vijay");
        ts.add("Ajay");
        ts.add("Anuj");
     //   ts.add(null);
       // ts.add(10);

        System.out.println(ts.add("Anuj"));
        System.out.println(ts);
    }
}