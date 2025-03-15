package PLACEMENT;



public class sortingDecending {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+i; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
}
