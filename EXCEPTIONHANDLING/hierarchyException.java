package EXCEPTIONHANDLING;

public class hierarchyException {
    public static void main(String[] args) {
        int[] numerator = {10, 20, 30, 40, 50};
        int[] denominator = {1, 2, 3, 0, 5};

        for (int i = 0; i < numerator.length; i++) {
            try {
                System.out.println(divide(numerator, numerator[i], denominator[i]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array Index out of Bound");
            } catch (Exception e) {
                System.out.println("Error: An unexpected exception occurred.");
            }
        }
        System.out.println("Good job");
    }

    public static int divide(int[] arr, int a, int b) {
        try {
            // Intentionally accessing out-of-bounds index to trigger exception
            System.out.println("Attempting to access an invalid array index:");
            System.out.println(arr[arr.length - 1]); // Access the last valid index
            
            return a / b; // Perform division
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            return 0; // Default return value in case of error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
            return 0; // Default return value in case of error
        } finally {
            System.out.println("Work completed. Hurray!");
        }
    }
}
