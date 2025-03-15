package PLACEMENT;


public class PerfectNumbers {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n; 
    }
    public static void main(String[] args) {
        System.out.println("Perfect numbers from 1 to 100000:");
        for (int num = 1; num <= 100000; num++) {
            if (isPerfect(num)) {
                System.out.println(num);
            }
        }
    }
}
