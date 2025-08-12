package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIF4 {

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
        al.add("R");


        System.out.println("al="+al);
        // predicate symbol ->

        // remove all the elements whose second character is a

        al.removeIf(str -> str.length()>=2 && str.charAt(1)=='a' );

        System.out.println("al="+al);//










    }
}
