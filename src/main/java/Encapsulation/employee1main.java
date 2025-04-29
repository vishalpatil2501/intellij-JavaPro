package Encapsulation;

public class employee1main {
    public static void main(String[] args) {

        employee1 emp2 = new employee1();
        emp2.employ("Vaishnavi", 26, 54000);

        System.out.println(emp2.getName());
        System.out.println(emp2.getAge());
        System.out.println(emp2.getSalary());

        employee1 emp1 = new employee1();
        emp1.setName("Vishal");
        emp1.setAge(28);
        emp1.setSalary(120000);


        System.out.println(emp1.getName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getSalary());


    }
}
