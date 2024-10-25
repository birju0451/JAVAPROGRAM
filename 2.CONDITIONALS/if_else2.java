import java.util.Scanner;
public class if_else2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n =sc.nextInt();
        if(n%5==0){
            System.out.println("the given number is divisible by 5");
            System.out.println();
        }
        else{
            System.out.println("number is not divisible by 5");
        }
        sc.close();
    }
}
