package OPPS.constructor;

class student {
    String name;
    int age;

    // 1. Non-parameterized constructor
    student() {
        System.out.println("Non-parameterized constructor called");
    }

    // 2. Parameterized constructor
    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. Copy constructor
    student(student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void print_info() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class constructor {
    public static void main(String[] args) {
        // Parameterized constructor
        student s1 = new student("Aman", 25);
        s1.print_info();

        // Non-parameterized constructor
        student s2 = new student();
        s2.print_info(); // This will print default values (null and 0)

        // Copy constructor
        student s3 = new student(s1);
        s3.print_info(); // This will print Aman's details (copied from s1)
    }
}
