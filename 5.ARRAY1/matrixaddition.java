import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row:");
        int r=sc.nextInt();
        System.out.println("enter the number of column ");
        int c=sc.nextInt();
        
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int sum[][]=new int[r][c];

        System.out.println("enter element for arra first");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the number for the second array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        //System.out.println("sum of first and second array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("the sum of two array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
