package Pro_Numbers;

public class OddNoCheck {
        public static void main(String[] args) {
            int count = 0;

            System.out.println("Odd numbers from 1 to 100:");

            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    count++;
                }
            }

            System.out.println("\n\nTotal odd numbers between 1 and 100: " + count);
        }
    }
