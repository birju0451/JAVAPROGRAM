package PLACEMENT;



public class secondLargest {
    public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};
    int mx=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>mx) {
            mx=arr[i];
        }
    }
    System.out.println("The Largest element in arr is  :"+mx);
    int smx=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>smx && arr[i]<mx) {
            smx=arr[i];
        }
    }
    System.out.println("The Second Largest in arr is : "+smx);
    }
}