package ArraysDemo.TwoDArray;

public class IntTwoDArray {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        a[0][0] =45;
        a[0][1] =46;
        a[0][2] =47;

        a[1][0] =15;
        a[1][1] =26;
        a[1][2] =37;

        a[2][0] =18;
        a[2][1] =29;
        a[2][2] =30;

        a[3][0] =58;
        a[3][1] =69;
        a[3][2] =70;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0; i<4 ; i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }


}
