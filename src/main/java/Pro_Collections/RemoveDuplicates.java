package Pro_Collections;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "C", "C++", "Python");

        // Using HashSet to remove duplicates
        Set<String> uniqueSet = new HashSet<>(list);

        // Convert back to list if needed
        List<String> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("Unique List: " + uniqueSet);
        System.out.println("Unique List: " + uniqueList);

    }
}
