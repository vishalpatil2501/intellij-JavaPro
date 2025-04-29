package Pro_String;

import java.util.Scanner;

public class CountTotalNoofCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine();

        // Count including spaces
        int totalWithSpaces = input.length();

        // Count excluding spaces
        String noSpaces = input.replace(" ", "");
        int totalWithoutSpaces = noSpaces.length();

        System.out.println("Total characters (including spaces): " + totalWithSpaces);
        System.out.println("Total characters (excluding spaces): " + totalWithoutSpaces);
        System.out.println(input);
        System.out.println(noSpaces);

        scanner.close();
    }
}
