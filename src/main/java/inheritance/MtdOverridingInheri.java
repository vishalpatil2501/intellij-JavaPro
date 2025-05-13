package inheritance;

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    Child() {
        super(); // Calls Parent constructor
        System.out.println("Child Constructor");
    }
}

public class MtdOverridingInheri {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
