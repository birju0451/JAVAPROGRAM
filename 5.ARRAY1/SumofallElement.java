import java.util.Scanner;

public class SumofallElement {

    void sumofarray() {
        int[] arr = {1, 4, 2, 3, 4, 6, 4, 6};
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Total sum of array: " + sum);
    }

    void maxofarray() {
        int[] arr2 = {5, 3, 6, 2, 8, 1};
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > ans) {
                ans = arr2[i];
            }
        }
        System.out.println("Maximum value in array: " + ans);
    }
    void searching(){
        int[] arr={5, 3, 6, 2, 8, 1};
        int x=2;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        System.out.println(" found "+x+" at index 3"+ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an operation:");
        System.out.println("1 -> Sum of array");
        System.out.println("2 -> Max of array");
        System.out.println("3 -> search the element in array");

        System.out.print("Enter your choice: ");
        int operator = sc.nextInt();

        SumofallElement obj = new SumofallElement();

        switch (operator) {
            case 1:
                obj.sumofarray();
                break;
            case 2:
                obj.maxofarray();
                break;
            case 3:
                obj.searching();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
