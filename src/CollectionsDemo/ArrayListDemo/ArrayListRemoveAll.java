package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

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
        al2.add("rani");
        al2.add("kiran");
        al2.add("vaishali");
        al2.add("rohit");
        al2.add("Prakash");
        al2.add("Kumar");
        al2.add("Prerna");
        al2.add("Pratik");

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);








    }
}
