package StringDemos;

public class SplitExample {
    public static void main(String[] args) {
        String str = "My job is to test";

        // Splitting the string by space
        String[] stArr = str.split(" ");

        // Looping through each word and printing it
        for (int i = 0; i < stArr.length; i++) {
            System.out.println(stArr[i]);
        }
    }
}

