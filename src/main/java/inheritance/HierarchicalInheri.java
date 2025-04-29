package inheritance;

class Animal2 {                   // Parent class
    void eat(){
        System.out.println("This animal eats food. ");
    }
}
class Dog2 extends Animal2 {        // Child class
    void bark (){
        System.out.println("Dog Bark ");
    }
}
class Cat2 extends Animal2 {
    void Meow (){
        System.out.println("Cat Meow ");
    }
}
public class HierarchicalInheri {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        Cat2 c = new Cat2();
        d.eat();
        d.bark();
        c.eat();
        c.Meow();
    }
}
