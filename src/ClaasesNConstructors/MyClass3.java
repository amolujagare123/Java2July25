package ClaasesNConstructors;

public class MyClass3 {

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

    MyClass3(int a1 , double d1 , char c1 ,String str1)
    {
        a = a1;
        d = d1;
        c= c1;
        str = str1;
    } // parameterized constructor

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3(23,45.11,'r',"amol");


        ob.display();

    }
}
