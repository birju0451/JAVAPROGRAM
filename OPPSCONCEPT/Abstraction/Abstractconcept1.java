package Abstraction;
abstract class Animal{//hum abstract class create kar sakate hai but use nahi kar sakate hai but property ko dusare me use kar sakte hai
   abstract void walk();//hamane ek abstract function or method create kiya hai jo type ke animal me exist karega 
    Animal(){
        System.out.println("you are creating a new animal");
    }
    public void eat(){
        System.out.println("Animal can eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on four legs");
    }
}
class hen extends Animal{
    public void walk(){
        System.out.println("hen walks on 2 legs");
    }
}

public class Abstractconcept1 {
    public static void main(String[] args) {
        Horse obj=new Horse();
        obj.walk();
    }
}
