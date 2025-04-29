package Pro_String;

public class Swapping_first_last_letter {
    public static String swapFirstAndLast(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        char[] chars = input.toCharArray();

        // Swap first and last characters
        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;

        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "world";
        String swapped = swapFirstAndLast(original);
        System.out.println("Original String: " + original);
        System.out.println("Swapped String: " + swapped);
    }
}
