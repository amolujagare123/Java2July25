package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIF2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Amol");
        al.add("Rajesh");
        al.add("Venkat");
        al.add("Prakash");
        al.add("Kumar");
        al.add("Prerna");
        al.add("Pratik");
        al.add("Parag");
        al.add("Dilip");
        al.add("Kajal");
        al.add("Ruhi");
        al.add("Rani");
        al.add("Kiran");
        al.add("Vaishali");
        al.add("Rohit");


        System.out.println("al="+al);
        // predicate symbol ->
        al.removeIf(str -> str.length()<=5  );

        System.out.println("al="+al);










    }
}
