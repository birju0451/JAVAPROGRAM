package PLACEMENT;



import java.util.Arrays;
public class PossibleTriangleDependOnAngle {
    public static void main(String[] args) {
        int[] arr = {10, 21, 22, 100, 101, 200, 300};
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] > arr[k] && arr[j] + arr[k] > arr[i] && arr[k] + arr[i] > arr[j]) {
                        count++;
                    }
                }
            }
        }   

        System.out.println(count);
    }
}
