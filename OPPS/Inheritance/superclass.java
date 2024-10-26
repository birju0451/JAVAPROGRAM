package OPPS.Inheritance;
/*
->super refers to the parent class object and can be used to call methods or constructors of the parent class.
->Use super() to call the parent class constructor from the child class constructor.
 */

class Animal6 {
    Animal6() {
        System.out.println("Animal constructor called");
    }
}

class Dog6 extends Animal6 {
    Dog6() {
        super(); // Calls the Animal constructor
        System.out.println("Dog constructor called");
    }
}

public class superclass {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Dog6 dog = new Dog6(); // Animal constructor will be called first
    }
}

