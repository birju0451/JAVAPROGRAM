package PLACEMENT;


public class secondSmallest {
    public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};

    int mn=Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]<mn) {
            mn=arr[i];
        }
    }
    System.out.println("The smallest element in the array is"+mn);

    int smn=Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]<smn && arr[i]>mn) {
            smn=arr[i];
        }
    }
    System.out.println("The scond smallest elemnt in the array is :"+smn);
    }
}
