package OPPS.Inheritance;
/*
>Method Overriding: A subclass can override a method of the superclass to provide a specific implementation.

>Use the @Override annotation to make it clear that you're overriding a method.

 */
class Animal4 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class goat extends Animal4 {
    @Override
    public void sound() {
        System.out.println("goat mee");
    }
}

public class methodOverride {
    public static void main(String[] args) {
        goat g1 =new goat();
        g1.sound();

    }
}
