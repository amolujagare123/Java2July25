package WrapperClassDemo;

public class WrapperClassDemo1 {
    public static void main(String[] args) {

        int i = 5;
        System.out.println("i="+i);

       // Integer ii = new Integer(5);

        Integer ii = 5;

        System.out.println("ii="+ii);


        Double dd = 12.34;
        System.out.println("dd="+dd);
        double d = dd.doubleValue(); // unboxing / unwrapping
        System.out.println("d="+d);

        double d1 = dd; // auto-unboxing / auto-unwrapping
        System.out.println("d1="+d1);
    }
}
