package ArraysDemo.TwoDArray;

public class StringTwoDArray2 {

    public static void main(String[] args) {

        String[][] stArr = {
                { "Aarav", "Saanvi", "Vivaan" },
                { "Diya", "Krishna", "Anaya" },
                { "Ishaan", "Meera", "Arjun" },
                { "Riya", "Veer", "Tara" }
        };

        for(int i=0; i<stArr.length ; i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
