package OPPS.Inheritance;
//in Hierarchical inheritance ,A multiple classes Inherit from a single parent class.
class Animal2 {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dogs extends Animal2 {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal2 {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();  // Inherited from Animal
        dog.bark(); // Method in Dog

        cat.eat();  // Inherited from Animal
        cat.meow(); // Method in Cat
    }
}
