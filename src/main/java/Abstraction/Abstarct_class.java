package Abstraction;

abstract class vehicle{             //Abstract Class
    abstract void start();          //Abstract Method (No implementation)
    void stop() {                  // Concrete Method
        System.out.println("Vehicle Stopped ");
    }
}
class Car extends vehicle{        //Concrete Method
    @Override
    void start() {               //implementing abstract method
        System.out.println("Car Starts with Key");
    }
}
public class Abstarct_class {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();   // Calls implemented method
        c.stop();    // Calls inherited method
    }
}
