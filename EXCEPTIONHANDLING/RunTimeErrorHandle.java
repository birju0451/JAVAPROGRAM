package EXCEPTIONHANDLING;

public class RunTimeErrorHandle {
    public static void main(String[] args) {

        int[] numerator = {10, 20, 30, 40, 50};
        int[] denominator = {1, 2, 3, 0, 5};

        for (int i = 0; i < numerator.length; i++) {
            System.out.println(divide(numerator[i], denominator[i]));
        }
    }

    public static int divide(int a, int b) {
        try {
            return a / b; // Perform division
        } catch (ArithmeticException e) { // Catch division by zero
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return a default value (e.g., 0) in case of an error
        }
    }
}
