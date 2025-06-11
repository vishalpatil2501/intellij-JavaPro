package Polymorphism;


class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2)); //  3 (int version)
        System.out.println(calc.add(1.5, 2.5));// 4.0 (double version)
    }
}
