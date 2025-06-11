package Pro_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10,20,30,10,20,50,60,20,30);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer nums : num ){
            if (!seen.add(nums)){
                //If add Returns false, Its a Duplicate
                duplicates.add(nums);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}
