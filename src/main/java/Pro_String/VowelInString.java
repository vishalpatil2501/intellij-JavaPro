package Pro_String;

import java.util.Scanner;
public class VowelInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for easy checking

        int vowelCount = 0;
        int ConsonantsCount = 0;
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                vowels = vowels + ch + " ";
            }
            else {
                ConsonantsCount++;
                consonants += ch + " ";
            }
        }
        System.out.println( "Vowels in String = " + vowelCount + " =  " + vowels);
        System.out.println( "Consonants in String = " + ConsonantsCount + " =  " + consonants);

        scanner.close();
    }
}
