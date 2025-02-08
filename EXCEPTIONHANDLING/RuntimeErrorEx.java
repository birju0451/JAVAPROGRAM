package EXCEPTIONHANDLING;

public class RuntimeErrorEx {
    public static void main(String[] args) {

        int[] numerator = {10, 20, 30, 40, 50};
        int[] denominator = {1, 2, 3, 0, 5};

        for (int i = 0; i < numerator.length; i++) {
            System.out.println(divide(numerator[i], denominator[i]));
        }
    }

    public static int divide(int a, int b) {
            return a / b; // Perform division
    }
}
