package Constructor;

public class ParameterizedConstructor {

    String name;
    int age;
    // Parameterized constructor
    ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name : " + name + "Age : "+ age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor pc = new ParameterizedConstructor("Vishal ", 28);
        ParameterizedConstructor pc2 = new ParameterizedConstructor("Sujit ", 25);
        pc.display();
        pc2.display();

    }
}
