import java.util.Scanner;

public class divisible5and3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if(n%3==0){
            if(n%5==0){
                System.out.println("number is divisible by three and five ");
            }
            else{
                System.out.println("number is not divisible by 3 and five");
            }
           
        }

        sc.close();
    }
}
