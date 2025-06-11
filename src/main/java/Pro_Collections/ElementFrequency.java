package Pro_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {

        List<String> element = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : element){
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        System.out.println("Frequency Map: " + freqMap);
    }
}
