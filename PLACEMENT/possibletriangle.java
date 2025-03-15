package PLACEMENT;


import java.util.Scanner;

public class possibletriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a>0 && b>0 && c>0){
            if (a+b > c && b+c >a && c+a>b ) {
             System.out.println("this is valid triangle");
            }
        }
        else{
            System.out.println("this is not  valid triangle");
        }
    }    
}
