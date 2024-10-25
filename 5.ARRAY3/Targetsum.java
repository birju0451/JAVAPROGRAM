import java.util.Scanner;

public class Targetsum {
    static int pairSum(int[] arr) {
        int target = 7, count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    static int tripletSum(int[] arr) {
        int target = 7, count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter your choice (1 for pair sum, 2 for triplet sum):");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Number of pairs with sum 7: " + pairSum(arr));
                break;
            case 2:
                System.out.println("Number of triplets with sum 7: " + tripletSum(arr));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
