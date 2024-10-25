import java.util.Scanner;
public class CheckareaAndperimeter6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        int l=sc.nextInt();
        System.out.println("Enter breadth:");
        int b= sc.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        if(area>perimeter){
            System.out.println("Area is greater than perimeter");
        }
        else{
            System.out.println("perimeter is greater than Area");
    
        }
        sc.close();
    }
}
