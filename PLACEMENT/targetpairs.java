package PLACEMENT;



public class targetpairs {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11,6,5,8,4};
        int target=23;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    for (int l = k+1; l < arr.length; l++) {
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            System.out.println(i+" "+j+" "+k+" "+l);
                        }   
                    }
                }
            }
        }
    }
}
