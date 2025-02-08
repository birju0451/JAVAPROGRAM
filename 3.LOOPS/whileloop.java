import java.util.Scanner;
// print the first n natural number where n is given by user.
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int num=1;
        while(num<=n){
            System.out.print( " "+num+ " ");
            num++;
        }
        sc.close();
    }
}
