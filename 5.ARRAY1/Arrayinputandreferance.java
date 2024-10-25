import java.util.Scanner;

public class Arrayinputandreferance {
    
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        // System.out.println("enter the size of array:");
        //int s=sc.nextInt();
        // int[] arr = new int[s];
        int[] arr = new int[5];
        arr[0]=5;
        arr[1]=8;
        arr[2]=7;
        arr[3]=2;
        arr[4]=52;
        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        }
      
        // System.out.println("enter the the Element of array:");
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("the array element are :");
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        //or
        // System.out.println("\n original array:");
        // printArray(arr);
        // System.out.println("\n");

        int[] arr2=arr;//here we are copy the arr to arr2 ,did not give the new location to arr2
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr2[i]);
        // }

        //or
        
        System.out.println("\ncopied arr2 element");
        printArray(arr2);

        //changing some values of arr2
        arr[0]=0;
        arr[1]=0;


        System.out.println("original array after changing arr2");
        printArray(arr2);

        System.out.println("copied array");
        printArray(arr2);
        sc.close(); 
    }
}
