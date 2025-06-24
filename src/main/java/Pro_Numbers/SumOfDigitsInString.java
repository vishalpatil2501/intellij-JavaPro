package Pro_Numbers;

public class SumOfDigitsInString {
    public static void main(String[] args) {

        String input = "Tv2fe3tg64e7ryt65";
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char chat = input.charAt(i);

            if (Character.isDigit(chat)) {
                sum += Character.getNumericValue(chat);
            }
        }
        System.out.println("Sum of digits = " + sum);
    }

}
