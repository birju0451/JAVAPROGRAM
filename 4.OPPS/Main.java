import java.util.Scanner;
class Algebra{
     int add(int a , int b){
        int ans=a+b;
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Algebra obj=new Algebra();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("sum of two number is:");
        int result=obj.add(x,y);
        System.out.println(result);
        sc.close();

    }
}
