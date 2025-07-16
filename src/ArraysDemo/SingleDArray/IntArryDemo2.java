package ArraysDemo.SingleDArray;

public class IntArryDemo2 {

    public static void main(String[] args) {

        int[] a = {12,34,56,78,12,8,99,12,56,78,9};

        System.out.println("length="+a.length);

       /* for(int i=0;i<a.length;i++)
           System.out.println(a[i]);*/

        for(int x:a)
            System.out.println(x);

    }
}
