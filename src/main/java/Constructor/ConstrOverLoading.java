package Constructor;

class Employee {
    String name;
    int age;
    //Default Constructor
    Employee(){
        name = "unknown";
        age = 0;
    }
    //Parametrized Constructor
    Employee(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name : " + name + " Age: "+ age);
    }
}

public class ConstrOverLoading {
    public static void main(String[] args) {

        Employee ep = new Employee();
        Employee ep2 = new Employee("Vishal ", 28);
        ep.display();
        ep2.display();
    }
}

