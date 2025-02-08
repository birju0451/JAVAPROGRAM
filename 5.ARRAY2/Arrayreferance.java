import java.util.Scanner;

public class Arrayreferance {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println("original array:");
        printArray(arr);

        //try to copy arr to arr_2
        int[] arr_2=arr;
        System.out.println("copied arr_2 is:");
        printArray(arr_2);

        //channging some element of arr_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("original array after changing array_2");
        printArray(arr);

        System.out.println("copied array after changing array_2 ");
        printArray(arr_2);
        sc.close();
    }
}
