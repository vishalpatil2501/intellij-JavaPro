package Pro_String;

import java.util.Scanner;

public class ReverseString3 {
    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        System.out.println("Reversed string: " + reverse(original));
    }
}
