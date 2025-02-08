package EXCEPTIONHANDLING;

public class StackTraceErrorHandle2 {
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception t) {
            t.printStackTrace();
            // StackTraceElement[] stacktrace =t.getStackTrace();
            // for (StackTraceElement i : stacktrace) {
            //     System.out.println(i);
                
            // }
        }
    }
    public static void level3(){
        int[] arr=new int[5];
        arr[5]=10;
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
