package PLACEMENT;



import java.util.Scanner;
public class firstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        
        int[] arr =new int[n];
        System.out.println("Enter the number of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("the first repeating element in the array is :"+ arr[i]);
                    return ;
                }
           }            
        }
       
    }
}
