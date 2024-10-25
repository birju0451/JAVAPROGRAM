public class Access_element {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int brr[]={12,18,30,930,29,38};
        //Accessing element from the array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); 
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        //if i want to access arr[6] the it gives error overflow condition
        System.out.println("\nelement of brr array:");

        for(int i=0;i<=brr.length;i++){
            System.out.println("the "+i+" element "+brr[i]);
        }
    }
}
