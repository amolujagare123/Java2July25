package ClaasesNConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    MyClass2()
    {
        a = 11;
        d = 11.22;
        c= 'g';
        str = "selenium";
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();


        ob.display();

    }
}
