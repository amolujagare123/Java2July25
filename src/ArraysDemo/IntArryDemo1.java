package ArraysDemo;

public class IntArryDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 23;
        a[1] = 44;
        a[2] = 11;
        a[3] = 18;
        a[4] = 36;

        System.out.println("length="+a.length);

        for(int i=0;i<a.length;i++)
           System.out.println(a[i]);
    }
}
