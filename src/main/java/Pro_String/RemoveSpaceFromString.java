package Pro_String;
import java.util.Scanner;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        // Using replaceAll() method to remove all spaces
        String result = input.replaceAll(" ", "");

        System.out.println("String after removing spaces: " + result);
        scanner.close();
    }
}
