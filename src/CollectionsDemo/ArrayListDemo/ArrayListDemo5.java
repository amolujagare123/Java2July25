package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

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

      //  al.remove(3);
        al.remove("Pratik");

        System.out.println(al);





    }
}
