package ExceptionHandling;

public class ThrowsKeyword {
    static void divide() throws ArithmeticException {
        int a = 10, b = 0;
        int result = a / b; // May throw ArithmeticException
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main method.");
        }
    }
}


