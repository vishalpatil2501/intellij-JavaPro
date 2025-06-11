package Pro_Collections;

import java.util.HashMap;
import java.util.Map;

public class IterateMapExample {
    public static void main(String[] args) {

        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 200);
        fruitPrices.put("Orange", 50);

        System.out.println("Using for each on entry Set");
        for(Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }

        System.out.println("Using KeySet ");
        for(String Key : fruitPrices.keySet()) {
            System.out.println(Key + " -> " + fruitPrices.get(Key));
        }


    }
}
