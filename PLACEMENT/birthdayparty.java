package PLACEMENT;

import java.util.HashSet;
import java.util.Scanner;

public class birthdayparty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the size of the array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }

        System.out.println(st.size());
        sc.close();
    }
}
