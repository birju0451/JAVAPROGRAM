import java.util.Scanner;

public class multiplecondition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n>99&&n<1000){
            System.out.println("the given number is three digit number");
        }
        else{
            System.out.println("number is not three digit number");
        }
        sc.close();

    }
}
