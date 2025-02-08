package EXCEPTIONHANDLING;
/*this is the output
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at EXCEPTIONHANDLING.StackTraceError.level3(StackTraceError.java:10)
        at EXCEPTIONHANDLING.StackTraceError.level2(StackTraceError.java:13)
        at EXCEPTIONHANDLING.StackTraceError.level1(StackTraceError.java:16)
        at EXCEPTIONHANDLING.StackTraceError.main(StackTraceError.java:6)
 */
public class StackTraceError {

    public static void main(String[] args) {
        level1();
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
