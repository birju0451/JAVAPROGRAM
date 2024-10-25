import java.util.Scanner;

public class mergeoftwoarray {
    public static void main(String[] args) {
        int i, n, m, p;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        n = sc.nextInt();

        System.out.println("Enter the size of the second array:");
        m = sc.nextInt();
        p = n + m;
        System.out.println("The size of the merged array is: " + p);

        // Creating the arrays
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int arr3[] = new int[p];

        System.out.println("Enter the elements of the first array:");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merging the arrays
        for (i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (i = 0; i < arr2.length; i++) {
            arr3[n + i] = arr2[i];  // Corrected the index here
        }

        System.out.println("Array elements after merging:");
        for (i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        sc.close();
    }
}
