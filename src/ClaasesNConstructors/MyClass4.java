package ClaasesNConstructors;

public class MyClass4 {

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

    MyClass4(int a , double d , char c , String str)
    {
        this.a = a;
        this.d = d;
        this.c= c;
        this.str = str;
    } // parameterized constructor with this operator

    public static void main(String[] args) {

        MyClass4 ob = new MyClass4(23,45.11,'r',"amol");


        ob.display();

    }
}
