
import java.util.Scanner;
public class help{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int operator,n1,n2;
        System.out.println("1.add\n 2.subtract\n 3.multiplication\n division");
        System.out.println("chose the operator");
        operator=sc.nextInt();
        System.out.println("enter the first number:");
        n1=sc.nextInt();
        System.out.println("enter the second number:");
        n2=sc.nextInt();
        int result=0;
        switch (operator) {
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
        
            case 3:
                result=n1*n2;
                break;
        
            case 4:
                result=n1/n2;
                break;

            default:
            System.out.println("Entered operator is invalid");
                break;
        }
        System.out.println("the Result is:"+ result);
        sc.close();
    }
}
