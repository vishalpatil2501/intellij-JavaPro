package Pro_String;
import java.util.Scanner;
public class Count_Words_in_Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim(); // Remove leading/trailing spaces

        // Check if sentence is empty after trimming
        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            // Split sentence by one or more spaces
            String[] words = sentence.split(" ");
            System.out.println("Word count: " + words.length);
        }

        scanner.close();
    }
}
