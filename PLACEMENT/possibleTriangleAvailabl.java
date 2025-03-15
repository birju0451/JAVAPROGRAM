package PLACEMENT;


public class possibleTriangleAvailabl {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11 , 6 , 5 ,8 , 4};
        //if the angle is not mension;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                if(i>0 && j>0 && k>0){
                        if (i+j > k && j+k > i && k+i>j ) {
                            count++;
                        }
                    }
                }
            }
        }   
        System.out.println(count);
    }
}