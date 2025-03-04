package PLACEMENT;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        int avg=(m+n+o)/3;
        System.out.println(avg);
        sc.close();
    }
    
}
