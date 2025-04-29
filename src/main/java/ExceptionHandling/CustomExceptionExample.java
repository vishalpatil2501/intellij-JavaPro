package ExceptionHandling;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
    static void checkNumber(int num) throws CustomException {
        if (num < 0) {
            throw new CustomException("Negative number not allowed.");
        } else {
            System.out.println("Valid number.");
        }
    }
    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
