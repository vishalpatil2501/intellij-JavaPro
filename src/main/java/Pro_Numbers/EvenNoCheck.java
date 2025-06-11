package Pro_Numbers;

public class EvenNoCheck {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Even numbers from 1 to 20:");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n\nTotal even no are : " + count);
    }
}
