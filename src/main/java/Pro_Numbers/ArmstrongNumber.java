package Pro_Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int digits = String.valueOf(number).length();
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

