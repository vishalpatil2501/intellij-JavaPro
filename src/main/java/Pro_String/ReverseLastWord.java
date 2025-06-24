package Pro_String;

public class ReverseLastWord {
    public static void main(String[] args) {

        String input = "I love my India";

        String [] words = input.split(" ");
        String lastword = words[words.length-1];

        // Manually reverse the last word using char array
        String revLastWord = "";
        for(int i = lastword.length()-1; i>=0; i--){
            revLastWord += lastword.charAt(i);
        }

        // Replace the last word with the reversed word
        words[words.length-1] = revLastWord;

        //print last word
        System.out.println("Last word after reverse: " + words[3]);

        // Join the words back into a sentence
        String result = "";
        for (int i =0; i< words.length; i++){
            result += words[i];
            if (i != words.length -1){
                result += " ";
            }
        }
        System.out.println(result);
    }
}

