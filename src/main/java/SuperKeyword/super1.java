package SuperKeyword;


class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}
class Dog extends Animal {
    Dog() {
        super(); // Calls Animal's constructor
        System.out.println("Dog constructor called");
    }
}

public class super1 {
    public static void main(String[] args) {

        Dog dg = new Dog();

    }
}
