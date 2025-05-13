package Pro_Array;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int key = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println(key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(key + " not found in the array.");
        }
    }
}