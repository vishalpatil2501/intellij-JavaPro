package Pro_Array;
import java.util.Arrays;

public class Sort_ele_in_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

//        Arrays.sort(arr); // Sort in ascending order
//        System.out.print ("Sorted Array: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        for(int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++ ){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                }
            }
        }
        System.out.println( "Sorted array: ");
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
