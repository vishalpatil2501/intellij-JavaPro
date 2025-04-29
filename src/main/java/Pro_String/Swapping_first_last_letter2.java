package Pro_String;

public class Swapping_first_last_letter2 {
    public static void main(String[] args) {
        String str = "apple";

        if (str.length() <= 1) {
            System.out.println(str);
        } else {
            String swapped = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
            System.out.println("Swapped String: " + swapped);
        }
    }
}
