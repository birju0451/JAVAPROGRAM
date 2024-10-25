import java.util.Scanner;

public class AraisetopowerB {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b =sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
            ans=ans*a;
        }
        System.out.println("a raise to the power b is:"+ans);
        sc.close();
    }
    
}
