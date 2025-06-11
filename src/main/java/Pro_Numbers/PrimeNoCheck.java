package Pro_Numbers;

public class PrimeNoCheck {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Prime numbers from 1 to 100:");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n\nTotal prime numbers: " + count);
    }
}



