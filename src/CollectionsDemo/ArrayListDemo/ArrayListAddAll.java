package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListAddAll {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("rajesh");
        al.add("Venkat");
        al.add("Prakash");
        al.add("Kumar");
        al.add("Prerna");
        al.add("Pratik");
        al.add("Parag");
        al.add("Dilip");


        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("kajal");
        al2.add("ruhi");

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);








    }
}
