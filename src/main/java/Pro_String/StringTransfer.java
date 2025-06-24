package Pro_String;

import java.util.HashMap;

public class StringTransfer {
    public static void main(String[] args) {
        String input = "tomorrow";
        StringBuilder output = new StringBuilder();

        // Step 1: Count character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Build the transformed string
        for (char ch : input.toCharArray()) {
            if (freqMap.get(ch) > 1) {
                output.append(freqMap.get(ch));
            } else {
                output.append(ch);
            }
        }

        // Output the result
        System.out.println("Transformed string: " + output);
    }
}
