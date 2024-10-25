package OPPS.polymorphism;
/*
Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. In Java, polymorphism can be achieved in two ways:

->Compile-time polymorphism (Method Overloading): Multiple methods in the same class with the same name but different parameters.
->Runtime polymorphism (Method Overriding): A subclass provides a specific implementation of a method that is already defined in its superclass.
*/

/*
1. Compile-time Polymorphism (Method Overloading)
In method overloading, a class can have multiple methods with the same name, but different parameter lists (different types or number of parameters).
 */
class Calculator {
    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers (Overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two doubles (Overloaded method)
    public double add(double a, double b) {
        return a + b;
    }
}

public class cp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));
    }
}
