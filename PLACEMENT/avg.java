package PLACEMENT;



import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
           sum+=arr[i];
        }
        System.out.println("ToTal sum of array"+sum);

        System.out.println("the avg is :"+sum/n);
        sc.close();
    }
    
}
