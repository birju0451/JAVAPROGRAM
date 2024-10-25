import java.util.Scanner;
public class javainput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x:");
        int x=sc.nextInt();
        System.out.println("enter ");
        int y=sc.nextInt();
        int sum =x+y;
        System.out.println("the sum of x and y: "+sum);
        sc.close();
    }
}
