package inheritance;

class Animal {                   // Parent class
    void eat(){
        System.out.println("This animal eats food. ");
    }
}
class Dog extends Animal {        // Child class
    void bark (){
        System.out.println("Dog Bark ");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();         // Inherited method
        d.eat();          // Child class method

    }
}
