import java.util.Scanner;

public class gretestofthree9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a:");
        int a =sc.nextInt();
        System.out.println("enter b:");
        int b =sc.nextInt();
        System.out.println("enter c:");
        int c =sc.nextInt();
        if(a>b){// a>b goto the if block
            if(a>c){
                System.out.println("a is the greatest number");
            }
            else{
                System.out.println("c is the greatest number");
            }
        }
        else{//b>a
            if(b>c){
                System.out.println("b is the greatest number");
            }
            else{
                System.out.println("c is the greatest number");
            }
        }
        sc.close();

    }
}
