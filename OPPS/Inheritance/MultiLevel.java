package OPPS.Inheritance;
//in multilevel inheritance , a c
class Animal1{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal1{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
class puppy extends Dog{
    public void weep(){
        System.out.println("puppy is weeping");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        puppy p1=new puppy();
        p1.eat();//inheritance from Animal class
        p1.bark();//inherited from dog class
        p1.weep();//method in puppy
    }
}
