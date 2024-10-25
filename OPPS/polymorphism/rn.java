package OPPS.polymorphism;
/*
METHOD OVERRIDING
------
Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. In Java, polymorphism can be achieved in two ways:
------
->Compile-time polymorphism (Method Overloading): Multiple methods in the same class with the same name but different parameters.
-------
->Runtime polymorphism (Method Overriding): A subclass provides a specific implementation of a method that is already defined in its superclass.
------
*/

/*
2. Runtime Polymorphism (Method Overriding)
In method overriding, a subclass provides its own implementation of a method that is already defined in its parent class. This allows dynamic method dispatch, where the method call is resolved at runtime based on the object type.
 */
class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal makes a sound");
        System.out.println("animal so pretty\n");
    }
    public void hello(){
        System.out.println("hello");
    }
}

class Dog extends Animal {
    // Overriding the parent class method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the parent class method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Horse extends Animal{
    @Override
    public void sound() {
        System.out.println("\n");
        super.sound();
        super.hello();
    }
}

public class rn {
    public static void main(String[] args) {
        // Parent reference, but child object (runtime polymorphism)
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myHorse = new Horse();


        // Method calls are resolved at runtime
        myAnimal.sound(); // Animal makes a sound
        myDog.sound();    // Dog barks
        myCat.sound();    // Cat meows
        myHorse.sound();  //horse sound
    }
}
