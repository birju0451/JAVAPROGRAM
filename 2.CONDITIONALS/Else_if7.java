import java.util.Scanner;
public class Else_if7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("percentage is ;");
        int percentage=sc.nextInt();
        if(percentage>90){
            System.out.println("Excellence");
        }
        else if(percentage>80){
            System.out.println("very good");
        }
        else if(percentage>70){
            System.out.println("good");
        }
        else if(percentage>60){
            System.out.println("can do better");
        }
        else{
            System.out.println("fail");
        }
        sc.close();

    }
}
