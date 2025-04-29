package Pro_Numbers;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int num = sc.nextInt();
        int sum = 0;

        while(num>0)
        {
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("Sum of Digits of " + num + " is " + sum);
        sc.close();
    }

}
