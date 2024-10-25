import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        System.out.println(n);
        if(n%2==0){
            System.out.println("number is even ");
        }
        else{
            System.out.println("number is odd");
        }
        sc.close();
    }
}
