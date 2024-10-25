import java.util.Scanner;
public class Leap_year3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year:");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("the given year is leap year");
            System.out.println("huuree maja aa gaya");
        }
        else{
            System.out.println("the given year is not leap year");
        }
        sc.close();
    }
}
