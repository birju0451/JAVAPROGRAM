import java.util.Scanner;
public class ProfitLoss5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter cost price:");
        int cp =sc.nextInt();
        System.out.println("Enter selling price:");
        int sp =sc.nextInt();
        if(sp>cp){
            System.out.println("he made profit");
            System.out.print("the profit is:"+(sp-cp));
        }
        else{
            System.out.println("he incurred loss");
            System.out.println("the loss is"+(cp-sp));
        }
        sc.close();
    }
}