package SuperKeyword;

class Animal1 {
    void speak() {
        System.out.println("Animal speaks");
    }
}
class Dog1 extends Animal1 {
    void speak() {
        super.speak(); // Calls Animal's speak()
        System.out.println("Dog barks");
    }
}

public class super2 {
    public static void main(String[] args) {

        Dog1 dg = new Dog1();
        dg.speak();
    }
}
