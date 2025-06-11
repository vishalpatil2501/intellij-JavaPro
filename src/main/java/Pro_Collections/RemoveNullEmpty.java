package Pro_Collections;

import java.util.Arrays;
import java.util.*;

public class RemoveNullEmpty {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "", null, "B"));
        list.removeIf(s -> s == null || s.isEmpty());
        System.out.println("Cleaned List: " + list);
    }
}
