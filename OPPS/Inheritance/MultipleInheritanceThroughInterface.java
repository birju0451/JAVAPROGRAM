package OPPS.Inheritance;
//java does not support multiple inheritance with classes to avoid complexity like the "diamond problem".
//multiple inheritance can be achieved using inheritance

interface Animal3 {
    void eat();
}
interface Pet {
    void play();
}

class Dog3 implements Animal3, Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class MultipleInheritanceThroughInterface {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        dog.eat();   // From Animal interface
        dog.play();  // From Pet interface
    }
}
