/*
take two integer input ,a and b :a>b,and find the reminder when a divided by b.
 */
import java.util.Scanner;
public class findreminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter dividend:");
        int a=sc.nextInt();
        System.out.print("enter divisor:");
        int b=sc.nextInt();
        //int reminder=a%b;
        int q=a/b;
        int r = a - (b*q);
        System.out.println("the reminder is:"+r);
        sc.close();
    }
}
