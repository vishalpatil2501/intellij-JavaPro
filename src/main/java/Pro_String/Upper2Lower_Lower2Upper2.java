package Pro_String;

public class Upper2Lower_Lower2Upper2 {
    public static String toggleCase(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String original = "Java IS Fun!";
        String toggled = toggleCase(original);
        System.out.println("Original: " + original);
        System.out.println("Toggled: " + toggled);
    }
}
