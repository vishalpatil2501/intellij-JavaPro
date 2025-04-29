package Pro_Numbers;
import java.util.Scanner;
public class Palidrome_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int num = number;
        int rev = 0;

        while (number != 0){

            rev = rev  * 10 + number % 10;
            number = number/10;
        }

        if (num == rev){
            System.out.println("Number is Palidrome");
        }
        else {
            System.out.println("Number is not Palidrome");
        }

    }
}
