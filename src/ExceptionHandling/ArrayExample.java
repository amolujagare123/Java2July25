package ExceptionHandling;

public class ArrayExample {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array of size 5
        int[] numbers = new int[5];

        // Step 2: Add 5 values into the array index by index
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;

        // Step 3: Print the array elements using a for loop
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
