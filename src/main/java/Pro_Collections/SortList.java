package Pro_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(40,10,50,20,30);

        // Ascending order
        Collections.sort(num);
        System.out.println("Ascending Order : " + num);

        // Descending order
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Descending Order : " + num);

    }
}
