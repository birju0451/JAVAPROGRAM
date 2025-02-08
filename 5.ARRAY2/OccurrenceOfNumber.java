import java.util.Scanner;

public class OccurrenceOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10;
        int count = 0;
        int[] arr = { 12, 10, 20, 50 };

        // Correcting the loop condition
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("The total number of " + x + " in the array is: " + count);
        sc.close();
    }
}
