package ExceptionHandling;

public class NumberDemo {

    void checkNumber(int i)
    {
        if(i>=1 && i<=10)
            System.out.println("We are safe");
        else
           throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

        int a = 4;

        NumberDemo ob = new NumberDemo();
        ob.checkNumber(a);

        System.out.println("a="+a);
        System.out.println("End of the program");
    }
}
