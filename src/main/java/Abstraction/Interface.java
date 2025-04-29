package Abstraction;

interface Animal {
    void makesound();       // abstract by default
    void sleep();
}
class Dog implements Animal{
    @Override
    public void makesound() {
        System.out.println("Dog Barks ");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeps");
    }
}


public class Interface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makesound();
        d.sleep();
    }
}
