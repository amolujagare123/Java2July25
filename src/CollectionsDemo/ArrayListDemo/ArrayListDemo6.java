package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(55);
        al.add(15);
        al.add(52);
        al.add(35);
        al.add(54);



        System.out.println(al);

        Integer ii = 35;

        al.remove(ii);

        System.out.println(al);





    }
}
