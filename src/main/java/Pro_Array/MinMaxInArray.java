package Pro_Array;

public class MinMaxInArray {
    public static void main(String[] args) {

        int a[] = {50, 30, 20, 70, 68, 6, 48};

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Maximum Element in Array : " + max);
        System.out.println("Maximum Element in Array : " + min);

    }
}
