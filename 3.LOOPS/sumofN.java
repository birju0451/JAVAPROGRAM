import java.util.Scanner;

public class sumofN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0,i=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("the total sum is:"+sum);
        sc.close();
    }
}
