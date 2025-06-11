package Pro_Collections;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(50,20,10,40,30,50);

        //Remove Duplicate
        Set<Integer> uniNum = new HashSet<>(num);

        // Convert to list and sort in descending order
        List<Integer> sortedList = new ArrayList<>(uniNum);
        Collections.sort(sortedList, Collections.reverseOrder());

        if (sortedList.size() >= 2){
            int SecondHighest = sortedList.get(1);
            System.out.println("Second highest number: " + SecondHighest);
        } else {
            System.out.println("Not enough unique elements to find the second highest.");
        }


    }
}
