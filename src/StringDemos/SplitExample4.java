package StringDemos;

public class SplitExample4 {
    public static void main(String[] args) {
      //  String str = "Hey baby you are some how late";
        String str = "This was so bliss that he is not true";

        // Splitting the string by space
        String[] stArr = str.split("is");

        // Looping through each word and printing it
        for (int i = 0; i < stArr.length; i++) {

              System.out.println(stArr[i]);
        }
    }
}

