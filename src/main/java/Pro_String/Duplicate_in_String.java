package Pro_String;

public class Duplicate_in_String {
    public static void main(String[] args) {
        String str = "Vishal Sonune";
        str = str.toLowerCase().replaceAll("\\s", "");

        int[] freq = new int [256];

        for (char ch : str.toCharArray()){
            freq[ch]++;
        }
        System.out.println("Duplicate characters are: ");
        for (int i = 0; i < 256; i++){
            if(freq[i] > 1){
                System.out.println((char) i + " : " + freq[i]);
            }
        }

    }
}
