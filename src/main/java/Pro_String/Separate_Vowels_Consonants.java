package Pro_String;
import java.util.Scanner;
public class Separate_Vowels_Consonants {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // normalize to lowercase

        String vowels = "";
        String consonants = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if it's an alphabet letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels += ch + " ";
                } else {
                    consonants += ch + " ";
                }
            }
        }
        System.out.println("Vowels: " + vowels.trim());
        System.out.println("Consonants: " + consonants.trim());

        scanner.close();
    }
}
