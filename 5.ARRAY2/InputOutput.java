import java.util.Scanner;

public class InputOutput {

    void Arrayinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is: " + arr[i]);
        }
        sc.close();
    }

    public static void main(String[] args) {
        InputOutput obj = new InputOutput();
        obj.Arrayinput();
    }
}
