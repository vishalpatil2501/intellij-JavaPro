package Pro_String;

public class Reversed_words_in_String {
    public static void main(String[] args) {

        String input = "Vishal Patil Sonune";

        String [] words = input.split(" ");
        String result = "";

        for (String word : words){
            String reversed = "";
            for(int i = word.length()-1; i>=0; i--){
                reversed += word.charAt(i);
            }
            result += reversed + " ";
        }
        System.out.println(result.trim());
    }
}
