package PLACEMENT;


public class linearsearch {
    
    public static void main(String[] args) {
        int[] arr={1,2,4,6,7,8};
        int target=61;
        int index=-1;
        boolean flag =false;
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                index=i;
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("Elment found  at index "+index);
        else System.out.println("Element is not found");
    }
}