package OPPS.polymorphism;

class student1{

    //these are called field
    String name;
    int age;

    //these are function
    public void print_info(String name){
        System.out.println("call one");
        System.out.println(name+"\n");
    }
    public void print_info(){
        System.out.println("call two");
        System.out.println(this.age+"\n");
    }
    public void print_info(String name,int age){
        System.out.println("call third");
        System.out.println(age+"\n");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        student1 s1=new student1();
        s1.name="aman";
        s1.age=21;
        s1.print_info();
        s1.print_info(s1.name);
        s1.print_info();
        s1.print_info(s1.name,s1.age);
    }
}
