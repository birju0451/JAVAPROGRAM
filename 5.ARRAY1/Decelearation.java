public class Decelearation{

    void demoArray() {
        int[] ages = new int[3]; // Declare and initialize an array of integers
        float[] weights = new float[5]; // Declare and initialize an array of floats
        String[] names = new String[3]; // Declare and initialize an array of Strings
        double[] kilometer=new double[5];//Decelaration and intialization of double

        // You cannot assign values to an array in this way
        // Instead, you can initialize the elements individually or use an initializer list
        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;

        weights[0] = 50.5f;
        weights[1] = 60.2f;
        weights[2] = 55.3f;
        weights[3] = 70.1f;
        weights[4] = 65.4f;

        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Doe";

        kilometer[0]=10;
        kilometer[1]=20;
        kilometer[2]=30;
        kilometer[3]=40;
        kilometer[4]=50;

        // Alternatively, you can use an initializer list for arrays at the time of declaration
        int[] ages2 = {1, 2, 3};
        float[] weights2 = {50.5f, 60.2f, 55.3f, 70.1f, 65.4f};
        String[] names2 = {"John", "Jane", "Doe"};
        double[] kilometer2={10,20,30,40,50};

        System.out.println(ages2[0]);
        System.out.println(weights2[0]);
        System.out.println(names2[0]);
        System.out.println(kilometer2[0]);
    }

    public static void main(String[] args) {
        System.out.println("hello world");
       Decelearation demo = new Decelearation();
        demo.demoArray();
    }
}
