package Pro_Numbers;
import java.util.HashSet;
import java.util.Set;

public class DistinctValues {
    public static void main(String[] args) {

        int [] arr = {4, 5, 6, 2, 4, 7, 9, 6, 2, 1};

        Set<Integer> val = new HashSet<>();
        for( int i = 0; i < arr.length; i++){
            val.add(arr[i]);
        }
        System.out.println("Distinct Values : ");

        for (int num : val) {
            System.out.print(num + " ");
        }
    }
}
