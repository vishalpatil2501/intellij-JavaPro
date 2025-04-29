package Pro_String;

public class Upper2Lower_Lower2Uppe {
    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Leave other characters unchanged
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String original = "Hello World 123!";
        String toggled = toggleCase(original);
        System.out.println("Original String: " + original);
        System.out.println("Toggled String: " + toggled);
    }
}
