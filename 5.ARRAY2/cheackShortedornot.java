public class cheackShortedornot {
   
    static boolean isshorted(int[] arr){
        boolean check=true;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,8,9};
        System.out.println(isshorted(arr));
    }
}
