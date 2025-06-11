package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        // 1. Create LinkedHashSet
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        // 2. Add elements
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("London"); // Duplicate – will not be added

        // 3. Display elements (maintains insertion order)
        System.out.println("Cities: " + cities);

        // 4. Size of LinkedHashSet
        System.out.println("Size: " + cities.size());

        // 5. Check if it contains an element
        System.out.println("Contains 'Paris'? " + cities.contains("Paris"));
        System.out.println("Contains 'Berlin'? " + cities.contains("Berlin"));

        // 6. Remove an element
        cities.remove("Tokyo");
        System.out.println("After removing 'Tokyo': " + cities);

        // 7. Iterate using for-each
        System.out.println("\nIterating using for-each loop:");
        for (String city : cities) {
            System.out.println(city);
        }

        // 8. Iterate using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 9. Clone the set
        LinkedHashSet<String> clonedSet = (LinkedHashSet<String>) cities.clone();
        System.out.println("\nCloned Set: " + clonedSet);

        // 10. Convert to array
        String[] cityArray = cities.toArray(new String[0]);
        System.out.println("\nConverted to Array:");
        for (String city : cityArray) {
            System.out.println(city);
        }

        // 11. Clear the set
        cities.clear();
        System.out.println("\nAfter clearing:");
        System.out.println("Cities: " + cities);
        System.out.println("Is empty? " + cities.isEmpty());
    }
}