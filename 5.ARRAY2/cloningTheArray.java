//import java.util.Arrays;
public class cloningTheArray {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int[] arr={5,6,1,4,5,6};
        
        System.out.println("original array");
        printArray(arr);

        //try to copy arr to arr_2
        int[] arr_2=arr.clone();
        System.out.println("coppied ");
        printArray(arr_2);

        //changing the some element of arr_2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after changing arr_2");
        printArray(arr);

        System.out.println("coppied array after changing arr_2");
        printArray(arr_2);

        
    }
}
