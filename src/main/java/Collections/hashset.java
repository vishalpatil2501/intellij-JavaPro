package Collections;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");  // Duplicate element, will not be added
        System.out.println("After adding elements: " + fruits);  // Output: [Apple, Banana, Cherry]

        // 2. Removing an element
        fruits.remove("Banana");  // Removes "Banana"
        System.out.println("After removing Banana: " + fruits);  // Output: [Apple, Cherry]


        // 3. Checking if an element is present
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains Apple? " + hasApple);  // Output: true

        // 4. Checking size and emptiness
        System.out.println("Size of the set: " + fruits.size());  // Output: 2
        System.out.println("Is the set empty? " + fruits.isEmpty());  // Output: false

        // 5. Clearing the set
        fruits.clear();
        System.out.println("After clearing: " + fruits);  // Output: []
    }
}

