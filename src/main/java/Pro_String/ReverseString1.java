package Pro_String;
import java.util.Scanner;
public class ReverseString1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string to reverse: ");
            String ori = sc.nextLine();
            String rev = "";

            for (int i = ori.length() - 1; i >= 0; i--) {
                rev = rev +  ori.charAt(i); // Add characters in reverse
            }

            System.out.println("Reversed string: " + rev);
            sc.close();
        }
    }


