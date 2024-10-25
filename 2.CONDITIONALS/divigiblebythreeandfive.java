import java.util.Scanner;
public class divigiblebythreeandfive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n= sc.nextInt();
        if(n%5==0&&n%3==0){
            System.out.println("number is divisible by 3 and 5");
            System.out.println("i get that number");
        }
        else{
            System.out.println("number is number is not divisible by three and five");
        }
        sc.close();
    }
}
