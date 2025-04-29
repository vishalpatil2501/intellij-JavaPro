package Pro_String;

import java.util.Scanner;

public class Count_Occurrence_of_Each_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String input = scanner.nextLine().toLowerCase();

        int[] count = new int[26]; // for 'a' to 'z'

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }
        // Display the frequency
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + count[i]);
            }
        }
    }
}
