
import java.util.Scanner;
public class numberdivisiblebyfiveandthree8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if((n%5==0 || n%3==0)&&n%15!=0){
            System.out.println("the number is divisible by 5 and 3 not 15");
        }
        else{
            System.out.println("not matching the required condition");
        }
        sc.close();
    }
}
