package Pro_Numbers;

import java.util.Scanner;

public class CheckEvenOddNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");

        int no = sc.nextInt();

        if ( no % 2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is ODD");
        }
    }
}
