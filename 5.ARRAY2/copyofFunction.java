import java.util.Arrays;
import java.util.Scanner;

public class copyofFunction {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 4, 5, 6};

        System.out.println("Original array:");
        printArray(arr);

        int arr_2[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Copy array arr to arr_2
                arr_2 = Arrays.copyOf(arr, arr.length);
                System.out.println("Copied array:");
                printArray(arr_2);

                // Changing some elements of arr_2
                arr_2[0] = 0;
                arr_2[1] = 0;
                System.out.println("Original array after changing arr_2:");
                printArray(arr);

                System.out.println("Copied array after changing arr_2:");
                printArray(arr_2);
                break;

            case 2:
                // Copy array arr to arr_2 with new length 2
                arr_2 = Arrays.copyOf(arr, 2);
                System.out.println("Copied array with length 2:");
                printArray(arr_2);

                // Changing some elements of arr_2
                arr_2[0] = 0;
                arr_2[1] = 0;
                System.out.println("Original array after changing arr_2:");
                printArray(arr);

                System.out.println("Copied array after changing arr_2:");
                printArray(arr_2);
                break;

            case 3:
                // Copy array arr to arr_2 with new length 2
                arr_2 = Arrays.copyOfRange(arr, 13, 3);

                System.out.println("Copied array with length 2:");
                printArray(arr_2);

                // Changing some elements of arr_2
                arr_2[0] = 0;
                arr_2[1] = 0;
                System.out.println("Original array after changing arr_2:");
                printArray(arr);

                System.out.println("Copied array after changing arr_2:");
                printArray(arr_2);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}
