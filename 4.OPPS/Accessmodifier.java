public class Accessmodifier {
    public String str_1="i am a public member";
    void printfromclass(){
        System.out.println("within class"+" " +str_1);
    }
    public static void main(String[] args) {
        Accessmodifier obj=new Accessmodifier();
        obj.printfromclass();
        System.out.println("within class"+obj.str_1);
    }
}
class Accessmodifier1{
    void printoutsideofClass(){
        Accessmodifier1 obj=new Accessmodifier1();
        obj.printoutsideofClass();
        System.out.println("within package ,outside claas");
    }
}