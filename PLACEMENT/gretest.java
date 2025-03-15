package PLACEMENT;



import java.util.Scanner;

public class gretest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println("The biggest number is :"+a);
        }else if (b>a && b>c) {
            System.out.println("The biggest number is :"+b);
        }else if (c>a && c>b) {
            System.out.println("The biggest number is :"+c);
        }else{
            System.out.println("all three are equal");
        }
        sc.close();
    }    
}
