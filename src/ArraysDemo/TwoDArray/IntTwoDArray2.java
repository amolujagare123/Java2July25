package ArraysDemo.TwoDArray;

public class IntTwoDArray2 {

    public static void main(String[] args) {
        int[][] a = {
                {11,22,33},
                {12,23,45},
                {34,56,78},
                {10,20,30}
        };


        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0; i<a.length ; i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }


}
