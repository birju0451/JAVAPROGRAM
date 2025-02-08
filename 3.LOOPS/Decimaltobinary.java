import java.util.Scanner;

public class Decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter decimal number:");
        int decimal_num=sc.nextInt();
        int ans=0;//binary number 

        int pw=1;
        while(decimal_num>0){
            int parity=decimal_num%2;//if number devided by two is called parity
            ans=ans+parity*pw;
            decimal_num=decimal_num/2;
            pw*=10;
        }
        System.out.println("the ans is :"+ans);
        sc.close();
    }
}
