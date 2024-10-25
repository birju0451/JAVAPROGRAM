public class Traversing {
    void trave() {
        int[] arr = {10, 12, 23, 84, 54, 79, 54};
        
        // Traversing using a traditional for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("using for-each loop");

        // Traversing using an enhanced for loop
        for (int x : arr) {
            System.out.println(x); // Corrected to print the value x
        }
    }

    public static void main(String[] args) {
        Traversing obj = new Traversing();
        obj.trave();
    }
}
