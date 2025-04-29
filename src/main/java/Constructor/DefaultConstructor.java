package Constructor;

public class DefaultConstructor {
    // Default constructor
    DefaultConstructor(){
        System.out.println("Calling Default Constructor");
    }
    void display(){
        System.out.println("Method Calling");
    }
    public static void main(String[] args) {
        DefaultConstructor dc = new DefaultConstructor();  // Constructor called automatically
        dc.display();
    }
}
