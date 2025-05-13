package Pro_Array;

public class Convert_StringArray_to_CharArray {
    public static void main(String[] args) {

        String str = "Hello";
        char[] array = str.toCharArray(); // Conversion to character from string
        for (char c : array) { //Iterating array values
            System.out.print(c + " , ");
        }
    }
}
