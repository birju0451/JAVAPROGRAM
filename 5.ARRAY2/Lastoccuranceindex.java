public class Lastoccuranceindex {
    static int lastoccurance(int[] arr,int x){
        int lastindex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
       
        return lastindex;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,2,7,8,9};
        int x=2;
        System.out.println(lastoccurance(arr, x));
       
    }
}
