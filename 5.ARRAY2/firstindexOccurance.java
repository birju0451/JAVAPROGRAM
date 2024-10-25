public class firstindexOccurance {
    
    static int first_occurance(int x, int[] arr){
        int firstoccurance=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                firstoccurance=i;
            }
        }
        return firstoccurance;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,10,30,70};int x=40;
        System.out.println("the first occurance of "+x+" at index "+first_occurance(x, arr));
    }
}
