package CollectionsDemo;

import java.util.Stack;

public class StackDemo2 {


    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Amit"); // 5
        s.push("Priya"); // 4
        s.push("Rahul"); // 3
        s.push("Sneha"); // 2
        s.push("Vikram");// 1

        System.out.println(s);

        System.out.println( s.search("Sneha1"));
        System.out.println( s.search("Sneha"));
        System.out.println( s.search("Priya"));

    }
}
