package Pro_Numbers;

import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long facto = 1;

        for ( int i = 1 ; i <= number; i++) {
            facto = facto * i;
        }
        System.out.println(facto);

    }
}

