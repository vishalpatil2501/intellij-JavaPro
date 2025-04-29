package Pro_String;
import java.util.Scanner;

public class Swap_TwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println("Before swap : ");
        System.out.println("String 1 = " + str1);
        System.out.println("String 2 = " + str2);

        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("after swap : ");
        System.out.println("String 1 = " + str1);
        System.out.println("String 2 = " + str2);

    }
}
