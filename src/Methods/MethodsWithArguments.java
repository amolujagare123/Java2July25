package Methods;

public class MethodsWithArguments {

    void method1()
    {
        System.out.println(" no arguments");
    }

    void method2(int a)
    {
        System.out.println("a="+a);
        System.out.println(" 1 arguments");
    }

    void method3(int a,int b,int c)
    {
        System.out.println("a="+a);
        System.out.println("a="+b);
        System.out.println("c="+c);
        System.out.println(" 3 arguments");
    }

    void method4(int a,double b,String c)
    {
        System.out.println("a="+a);
        System.out.println("a="+b);
        System.out.println("c="+c);
        System.out.println(" 3 arguments");
    }

    void method5(int[] arr)
    {
        System.out.println("=== Below is the array ===");

        for (int x : arr)
            System.out.print(x + "\t");

        System.out.println();
    }

    void method6(String[][] stArr) {
        System.out.println("=== Below is the 2D array ===");

        for (int i=0;i< stArr.length ;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }

    }

        public static void main(String[] args) {

        MethodsWithArguments ob = new MethodsWithArguments();

        ob.method1();
        ob.method2(23);
        ob.method3(23,67,89);
        ob.method4(23,67.45,"Amol");

        int[] b = {12,45,67,89,0,11,23};

        ob.method5(b);


            String[][] namesArr = {
                    { "Aarav", "Saanvi", "Vivaan" },
                    { "Diya", "Krishna", "Anaya" },
                    { "Ishaan", "Meera", "Arjun" },
                    { "Riya", "Veer", "Tara" }
            };

            ob.method6(namesArr);



    }
}
