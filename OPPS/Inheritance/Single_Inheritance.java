package OPPS.Inheritance;
//in singe inheritance , a subclass inherits only one superclass
class Animal{
    //parent class method
    public void  eat(){
        System.out.println("Animal is eating");
    }
}
class dogs extends Animal{
    //child class method
    public void bark(){
        System.out.println("Dog is barking");
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        dogs d1=new dogs();
        d1.eat();//Inherited method from Animal
        d1.bark();//method i dog class
    }
}
