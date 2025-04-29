package inheritance;

class Animal1 {                   // Parent class
    void eat(){
        System.out.println("This animal eats food. ");
    }
}
class Dog1 extends Animal1 {        // Child class
    void bark (){
        System.out.println("Dog Bark ");
    }
}
class Cat extends Dog1 {
    void Meow (){
        System.out.println("Cat Meow ");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.Meow();
        c.eat();
        c.bark();
    }
}

