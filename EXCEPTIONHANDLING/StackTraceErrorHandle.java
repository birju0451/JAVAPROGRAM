package EXCEPTIONHANDLING;
/*
 * output:-java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
 */
public class StackTraceErrorHandle {
    public static void main(String[] args) {
        level1();
    }
    public static void level3(){
        int[] arr=new int[5];
        try {
            arr[5]=10; 
        } catch (Exception e) {
           System.out.println(e);
        }
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
