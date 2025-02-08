import java.util.Scanner;
// count the number of digit for a given number n.-
public class cuntNunber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count ++;
        }
        System.out.println("total number present in n"+count);
        sc.close();
    }  
}