import java.util.Arrays;
public class findSmallestAndlargest {
    static int[] SmallestAndlargest(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 12, 10, 20, 50 };
        SmallestAndlargest(arr);
        
    }
}
