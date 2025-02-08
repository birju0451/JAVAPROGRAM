package EXCEPTIONHANDLING;

public class hierarchyexception1 {
    public static void main(String[] args) {
        int[] numerator = {10, 20, 30, 40, 50};
        int[] denominator = {1, 2, 3, 0, 5};

        for (int i = 0; i < numerator.length + 2; i++) { // Intentionally go out of bounds
            try {
                System.out.println(divide(numerator, numerator[i], denominator[i]));
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds.");
            } catch (NullPointerException e) {
                System.out.println("Error: Null array encountered.");
            } catch (Exception e) {
                System.out.println("Error: An unexpected exception occurred.");
            }
        }
        System.out.println("Good job");
    }

    public static int divide(int[] arr, int a, int b) {
        try {
            // Simulate various exceptions
            System.out.println("Attempting to access an invalid array index:");
            System.out.println(arr[arr.length]); // Intentional out-of-bounds access

            return a / b; // Perform division
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
            return 0; // Default return value in case of division by zero
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index.");
            return 0; // Default return value in case of array index error
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Null array accessed.");
            return 0; // Default return value in case of null array
        } finally {
            System.out.println("Work completed. Hurray!");
        }
    }
}
