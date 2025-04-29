package Pro_Numbers;

import java.util.Scanner;

public class Count_digit_in_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int num = sc.nextInt();
        int count = 0;
        int temp = num;

        if(num == 0){
            count = 1;
        }
        else{
            while(num != 0){
                num = num/10;
                count++;
            }
        }
        System.out.println("Total Digits in " + temp + " is " + count);
        sc.close();
    }
}
