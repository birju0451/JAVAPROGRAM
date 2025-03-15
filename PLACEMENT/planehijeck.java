package PLACEMENT;


import java.util.Scanner;
public class planehijeck {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the no of row:");
        int m=sc.nextInt();
        System.out.println("Enter the no of column:");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        }
        // System.out.println("The ages of passenger are:");
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        int averge=sum/(m*n);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]>=averge) {
                    count++;
                }
            }
        }

        System.out.println("Total no of pasenger greater than average : "+count);
        sc.close();        
    }
}
