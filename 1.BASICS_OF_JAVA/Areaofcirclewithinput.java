import java.util.Scanner;

public class Areaofcirclewithinput 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // create a scanner object
        System.out.print("Enter radius: "); // prompt the user to enter radius
        int radius = s.nextInt(); // read the radius input from the user

        double pi = 3.1415; // value of pi

        double area = pi * radius * radius; // calculate the area of the circle
        System.out.println("The area of circle with radius " + radius + " is " + area); // display the area
        s.close();
    }
}
