
package PLACEMENT;
import java.util.Scanner;

public class _01winnig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int win=0;
        int lose=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='1') win++;
            else lose++; 
        }
        if (win>lose) {
            System.out.println("peater wins the match!");
        }
        else{
            System.out.println("peater lose the match !");
        }
        sc.close();
    }
}
