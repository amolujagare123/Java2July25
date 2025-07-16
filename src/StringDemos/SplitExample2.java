package StringDemos;

public class SplitExample2 {
    public static void main(String[] args) {
        String str = "Hey baby you are so lovely";

        // Splitting the string by space
        String[] stArr = str.split(" ");

        // Looping through each word and printing it
        for (int i = 0; i < stArr.length; i++) {

            String temp = stArr[i];
            int l = temp.length();

            if(temp.charAt(l-1)=='y')
              System.out.println(stArr[i]);
        }
    }
}

