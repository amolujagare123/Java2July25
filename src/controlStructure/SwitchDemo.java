package controlStructure;

public class SwitchDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c;
        String operation = "dsdsd";

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("addition="+c);
                break;

            case "sub" :c = a - b;
                System.out.println("Subtraction="+c);
                break;

            case "div" :c = a / b;
                System.out.println("division="+c);
                break;

            case "mult" :c = a * b;
                System.out.println("Multiplication="+c);
                break;

            default:
                System.out.println("wrong choice");
                break;
        }

    }


}
