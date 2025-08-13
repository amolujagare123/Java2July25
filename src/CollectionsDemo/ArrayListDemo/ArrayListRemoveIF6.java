package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIF6 {

    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');
        al.add('o');

        System.out.println("al="+al);
        // predicate symbol ->

        al.removeIf(ch -> (ch=='a' || ch=='o' || ch=='e'||ch=='i'||ch=='u') );

        System.out.println("al="+al);//










    }
}
