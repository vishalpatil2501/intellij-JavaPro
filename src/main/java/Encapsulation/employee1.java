package Encapsulation;

public class employee1 {
    private String name;
    private int age;
    private double salary;

    public void employ(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
