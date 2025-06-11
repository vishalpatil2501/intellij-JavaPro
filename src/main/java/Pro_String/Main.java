package Pro_String;

class Main {
    public static void main(String[] args) {

        String input="welcome organizaion";

        String [] words = input.split(" ");
        String result = "";

        for( String word : words){
            String reversed = "";
            for(int i = word.length()-1; i >=0; i--){
                reversed = reversed + word.charAt(i);
            }
            result += reversed + " ";
        }
        System.out.println(result.trim());



    }
}