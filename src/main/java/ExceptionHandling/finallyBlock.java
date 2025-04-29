package ExceptionHandling;

public class finallyBlock {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught.");
        } finally {
            System.out.println("This will always execute.");
        }
    }

}
