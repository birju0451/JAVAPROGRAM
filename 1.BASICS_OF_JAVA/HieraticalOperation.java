public class HieraticalOperation {
    public static void main(String[] args) {
        int i = 2, j = 3, k, l;
        double a, b;

        k = (i / j) * j;
        l = (j / i) * i;
        a = ((double)i / j) * j;
        b = ((double)j / i) * i;

        System.out.println(k + " " + l + " " + a + " " + b);
    }
}
