package Methods;

public class MethodsReturningValue {


    int myMethod()
    {
        int x = 11;
        return x; // 11
    }

    int[] getMyArray()
    {
        int[] x = {11,22,33,44,55,66,77,88,99};
        return x;
    }

    String[][] getMyTwoDArray()
    {
        String[][] namesArr = {
                { "Aarav", "Saanvi", "Vivaan" },
                { "Diya", "Krishna", "Anaya" },
                { "Ishaan", "Meera", "Arjun" },
                { "Riya", "Veer", "Tara" }
        };

        return namesArr;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = a ;

        System.out.println(a);

        MethodsReturningValue ob = new MethodsReturningValue();

        int y = ob.myMethod();

        System.out.println("y="+y);

        int[] arr = ob.getMyArray();

        for (int x : arr)
            System.out.println(x);


        String[][] stArr = ob.getMyTwoDArray();

        for (int i=0;i< stArr.length ;i++)
        {
            for (int j=0; j<stArr[0].length ;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }

            System.out.println();
        }
    }
}
