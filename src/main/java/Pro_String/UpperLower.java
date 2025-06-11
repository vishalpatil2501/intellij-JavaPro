package Pro_String;

public class UpperLower {
    public static void main(String[] args) {
        String Ori = "Vishal Patil";
        String result = "";

        for (int i = 0; i < Ori.length(); i++) {
            char ch = Ori.charAt(i);

            if (Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        System.out.println( result);

    }
}
