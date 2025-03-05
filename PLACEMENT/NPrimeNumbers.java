package PLACEMENT;

import java.util.Scanner;

public class NPrimeNumbers {
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to print the first N prime numbers
    static void printNPrimes(int n) {
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to print: ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println("First " + n + " prime numbers:");
        printNPrimes(n);
    }
}
