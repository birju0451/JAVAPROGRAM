// import java.util.Scanner;

// class ArrayExample{
//     static void maxofarray(){ 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int x = sc.nextInt();
//         int[] arr = new int[x];
//         for(int i = 0; i < arr.length; i++){
//             System.out.println("Enter element " + i + ":");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("\n");

//         System.out.println("The array elements are:");
//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }

//         int ans = arr[0]; // Initialize with the first element
//         for(int i = 1; i < arr.length; i++){
//             if(arr[i] > ans){
//                 ans = arr[i];
//             }
//         }
//         System.out.println("The max number is: " + ans);
//         sc.close();
//     }
// }

// public class max {
//     public static void main(String[] args) {
//         ArrayExample.maxofarray(); // Call static method directly
//     }
// }
