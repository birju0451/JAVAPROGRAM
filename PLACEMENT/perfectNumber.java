package PLACEMENT;



import java.util.Scanner;

public class perfectNumber {
    public static boolean print(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i<=n; i++) {
            if(print(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
    
}
