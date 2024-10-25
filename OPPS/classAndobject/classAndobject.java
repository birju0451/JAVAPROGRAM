package OPPS.classAndobject;

class students {
    String name;
    String age;
    public void  print_info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class classAndobject {
    public static void main(String[] args) {
        students s1=new students();
        s1.name="aman";
        s1.age="22";
        s1.print_info();
    }
}
