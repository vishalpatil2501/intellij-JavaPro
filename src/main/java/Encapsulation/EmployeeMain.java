package Encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Vishal");
        emp1.setAge(25);

        Employee emp2 = new Employee();
        emp2.setName("Vaishu");
        emp2.setAge(23);

        System.out.println(emp1.getName() + " - " + emp1.getAge());  // Vishal - 25
        System.out.println(emp2.getName() + " - " + emp2.getAge());  // Vaishu - 23
    }
}
