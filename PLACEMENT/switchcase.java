package PLACEMENT;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice:");
        int choice=sc.nextInt();
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                // System.out.println("Enetr a :");
                // int a =sc.nextInt();
                // System.out.println("Enter b");
                // int b=sc.nextInt();

                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        
            default:
                System.out.println("Invalid day");
                break;
        }
        sc.close();
    }
}
