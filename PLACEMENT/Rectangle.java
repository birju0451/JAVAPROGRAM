package PLACEMENT;



import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();
        
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
        sc.close();
    }
}

