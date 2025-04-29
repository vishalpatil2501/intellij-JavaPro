package Pro_String;

public class Input_ExpandedOutput {
    public static void main(String[] args) {
        String input = "c4v2a3";
        String output = "";

        for (int i = 0; i < input.length(); i += 2) {
            char letter = input.charAt(i);         // Get the character
            int count = input.charAt(i + 1) - '0'; // Convert char digit to int

            for (int j = 0; j < count; j++) {
                output += letter; // Append character 'count' times
            }
        }

        System.out.println("Output: " + output); // Output: ccccvvaaa
    }
}
