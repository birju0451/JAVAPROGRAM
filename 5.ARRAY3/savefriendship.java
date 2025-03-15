import java.util.Arrays;
import java.util.Scanner;
/*
 * 2
 * 3 2           2
 * 
 * 5
 * 2 4 3 4 6
 * 
 * 6
 * 1 2 5 3 4 8    6
 */
public class savefriendship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the size of the array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=arr.length;
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]==arr[i+1]){
            count--;
           }
        }
        System.out.println(count);
        sc.close();
    }
}
