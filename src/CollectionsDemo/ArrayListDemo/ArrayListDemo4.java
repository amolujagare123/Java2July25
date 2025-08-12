package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

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


        System.out.println(al);

        al.set(4,"XYZ");

        System.out.println(al);





    }
}
