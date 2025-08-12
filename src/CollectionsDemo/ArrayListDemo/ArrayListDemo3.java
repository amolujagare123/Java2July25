package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add("amol");
        al.add("rajesh");
        al.add("Venkat");
        al.add("Prakash");
        al.add("Kumar");
        al.add("Prerna");
        al.add("Pratik");
        al.add("Parag");
        al.add("Dilip");

        System.out.println(al.isEmpty()); // false
        System.out.println(al);
        al.clear();
        System.out.println(al.isEmpty()); // true

        System.out.println(al);





    }
}
