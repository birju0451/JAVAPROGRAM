public class Assignment_operator {
    public static void main(String[] args) {
        int p = 10;
        int q;
        // =
        q = p;
        System.out.println(q);

        // +=
        p += q;
        System.out.println(p);

        p-=q;
        System.out.println(p);

        p*=q;
        System.out.println(p);

        p/=q;
        System.out.println(p);
    }

    public static class AreaOfcircle {
        public static void main(String[] args) {
            double radius = 5;
            double pi = 3.1415;
            double area = pi*radius*radius;
            System.out.println("area of circle is "+area);
        }
    }
}
