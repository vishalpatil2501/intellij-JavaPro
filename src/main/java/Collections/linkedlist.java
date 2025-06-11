package Collections;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After adding elements: " + fruits);  // [Apple, Banana, Cherry]

        // 2. Accessing elements
        System.out.println("First element: " + fruits.getFirst());  // Apple
        System.out.println("Last element: " + fruits.getLast());  // Cherry

        // 3. Removing elements
        fruits.remove(1);  // Removes element at index 1 (Banana)
        System.out.println("After removing Banana: " + fruits);  // [Apple, Cherry]
        fruits.remove("Cherry");  // Removes "Cherry"
        System.out.println("After removing Cherry: " + fruits);  // [Apple]

        // 4. Searching for elements
        System.out.println("Contains Apple? " + fruits.contains("Apple"));  // true
        System.out.println("Index of Apple: " + fruits.indexOf("Apple"));  // 0

        // 5. Checking size and emptiness
        System.out.println("Size of list: " + fruits.size());  // 1
        System.out.println("Is list empty? " + fruits.isEmpty());  // false

        // 6. Clearing the list
        fruits.clear();
        System.out.println("After clearing: " + fruits);  // []

    }
}
