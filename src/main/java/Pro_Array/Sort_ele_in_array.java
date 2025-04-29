package Pro_Array;
import java.util.Arrays;

public class Sort_ele_in_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        Arrays.sort(arr); // Sort in ascending order

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
