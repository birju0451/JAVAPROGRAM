import java.util.Scanner;
public class SquareOrNot6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter length:");
        int l =sc.nextInt();
        System.out.println("enter breadth:");
        int b = sc.nextInt();
        if(l==b){
            System.out.println("it is square:");
        }
        else{
            System.out.println("it is not square");
        }
        sc.close();
    }
}
