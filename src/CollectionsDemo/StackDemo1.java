package CollectionsDemo;

import java.util.Stack;

public class StackDemo1 {


    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Amit");
        s.push("Priya");
        s.push("Rahul");
        s.push("Sneha");
        s.push("Vikram");

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
    }
}
