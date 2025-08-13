package CollectionsDemo;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("size="+v.size()); // 0
        System.out.println("capacity="+v.capacity()); // 10

        v.add("amol");
        v.add("rajesh");
        v.add("Venkat");
        v.add("Prakash");
        v.add("Kumar");
        v.add("Prerna");
        v.add("Pratik");
        v.add("Parag");
        v.add("Dilip");
        v.add("Dilip");
        v.add("Dilip");
        v.add("Venkat");
        v.add("Prakash");
        v.add("Kumar");
        v.add("Prerna");
        v.add("Pratik");
        v.add("Parag");
        v.add("Dilip");
        v.add("Dilip");
        v.add("Dilip");
        v.add("Dilip");

        System.out.println("size="+v.size()); // 21
        System.out.println("capacity="+v.capacity()); // 40

        System.out.println(v);

    }
}
