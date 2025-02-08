import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter principle");
        float p = sc.nextInt();

        System.out.println("enter rate of interest ");
        float r = sc.nextInt();

        System.out.println("Enter time");
        float t = sc.nextInt();

        float si = (p*r*t)/100;
        System.out.print("the simple interest is :"+si);
        sc.close();

    }

}
