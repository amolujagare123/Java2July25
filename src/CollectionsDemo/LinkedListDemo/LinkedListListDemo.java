package CollectionsDemo.LinkedListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("rajesh");
        ll.add("Venkat");
        ll.add("Prakash");
        ll.add("Kumar");
        ll.add("Prerna");
        ll.add("Pratik");
        ll.add("Parag");
        ll.add("Dilip");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);





    }
}
