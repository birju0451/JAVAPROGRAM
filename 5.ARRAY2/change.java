public class change {
    static void change_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;

        arr[2] = 30;
        System.out.println("original array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        change_arr(arr);
        System.out.println("arr after changing ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}