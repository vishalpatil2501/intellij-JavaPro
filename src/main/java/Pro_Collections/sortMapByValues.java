package Pro_Collections;

import java.util.*;

public class sortMapByValues {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>(Map.of("Java", 30, "Python", 20, "C++", 10));
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
