package Pro_Collections;

// Java Collection Programs

import java.util.*;

public class JavaCollectionsPro {

    // 1. Remove duplicates from a list
    public static void removeDuplicates() {
        List<String> list = Arrays.asList("Java", "Python", "Java", "C++", "Python");
        Set<String> set = new HashSet<>(list);
        System.out.println("Unique Elements: " + set);
    }

    // 2. Frequency of each element
    public static void elementFrequency() {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) map.put(s, map.getOrDefault(s, 0) + 1);
        System.out.println("Frequency Map: " + map);
    }

    // 3. Sort list ascending/descending
    public static void sortList() {
        List<Integer> nums = Arrays.asList(5, 3, 8, 2, 9);
        Collections.sort(nums);
        System.out.println("Ascending: " + nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Descending: " + nums);
    }

    // 4. Second highest number
    public static void secondHighest() {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 7, 9);
        TreeSet<Integer> set = new TreeSet<>(list);
        set.pollLast();
        System.out.println("Second Highest: " + set.last());
    }

    // 5. Find duplicates
    public static void findDuplicates() {
        List<String> list = Arrays.asList("A", "B", "C", "A", "B");
        Set<String> seen = new HashSet<>();
        Set<String> dup = new HashSet<>();
        for (String s : list) if (!seen.add(s)) dup.add(s);
        System.out.println("Duplicates: " + dup);
    }

    // 6. Array to list and vice versa
    public static void arrayListConversion() {
        String[] arr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arr);
        System.out.println("List: " + list);
        String[] array = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));
    }

    // 7. Iterate over a Map
    public static void iterateMap() {
        Map<String, Integer> map = Map.of("A", 1, "B", 2);
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    // 8. Sort map by values
    public static void sortMapByValue() {
        Map<String, Integer> map = new HashMap<>(Map.of("Java", 30, "Python", 20, "C++", 10));
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

    // 9. Remove null or empty
    public static void removeNulls() {
        List<String> list = new ArrayList<>(Arrays.asList("A", "", null, "B"));
        list.removeIf(s -> s == null || s.isEmpty());
        System.out.println("Cleaned List: " + list);
    }

    // 10. Reverse a list
    public static void reverseList() {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }

    // 11. Common elements
    public static void commonElements() {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("B", "C", "D");
        list1 = new ArrayList<>(list1);
        list1.retainAll(list2);
        System.out.println("Common: " + list1);
    }

    // 12. Group by frequency (word count)
    public static void groupByFrequency() {
        String[] words = {"apple", "banana", "apple"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        System.out.println("Grouped: " + map);
    }

    // 13. Merge lists and remove duplicates
    public static void mergeLists() {
        List<String> l1 = Arrays.asList("A", "B");
        List<String> l2 = Arrays.asList("B", "C");
        Set<String> set = new HashSet<>();
        set.addAll(l1);
        set.addAll(l2);
        System.out.println("Merged Unique: " + set);
    }

    // 14. Custom sort with comparator
    public static void customSort() {
        List<String> names = Arrays.asList("John", "Amanda", "Bob");
        names.sort((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Sorted by length: " + names);
    }

    // 15. Convert list of "key=value" to map
    public static void listToMap() {
        List<String> list = Arrays.asList("a=1", "b=2");
        Map<String, String> map = new HashMap<>();
        for (String entry : list) {
            String[] parts = entry.split("=");
            map.put(parts[0], parts[1]);
        }
        System.out.println("Map: " + map);
    }

    // 16. Count characters using Map
    public static void charCount() {
        String str = "hello";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println("Char Count: " + map);
    }

    // 17. Check if two lists are equal ignoring order
    public static void equalLists() {
        List<String> l1 = Arrays.asList("A", "B", "C");
        List<String> l2 = Arrays.asList("C", "A", "B");
        System.out.println(new HashSet<>(l1).equals(new HashSet<>(l2)));
    }

    // 18. Palindrome list
    public static void isPalindrome() {
        List<String> list = Arrays.asList("A", "B", "A");
        List<String> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        System.out.println("Is Palindrome: " + list.equals(reversed));
    }

    // 19. PriorityQueue with Comparator
    public static void customPriorityQueue() {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> b.length() - a.length());
        pq.add("Java");
        pq.add("Python");
        pq.add("C");
        while (!pq.isEmpty()) System.out.println(pq.poll());
    }

    // 20. First non-repeating character
    public static void firstNonRepeatingChar() {
        String str = "aabbcdde";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First non-repeating: " + e.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicates();
        elementFrequency();
        sortList();
        secondHighest();
        findDuplicates();
        arrayListConversion();
        iterateMap();
        sortMapByValue();
        removeNulls();
        reverseList();
        commonElements();
        groupByFrequency();
        mergeLists();
        customSort();
        listToMap();
        charCount();
        equalLists();
        isPalindrome();
        customPriorityQueue();
        firstNonRepeatingChar();
    }
}
