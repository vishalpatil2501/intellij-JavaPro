package Pro_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ArrayListConversion {
    public static void main(String[] args) {

        // === 1. Object array (Integer[]) to List ===
        Integer [] objArr = {10,20,30,40};
        List<Integer> objlist = Arrays.asList(objArr);
        System.out.println("Object Array to List " + objlist);

        // === 2. List to Object array ===
        Integer[] newObjArr = objlist.toArray(new Integer[0]);
        System.out.println("List to Obj Array " + Arrays.toString(newObjArr));

        // === 3. Primitive array (int[]) to List ===
        int[] primitiveArray = {1, 2, 3, 4};
        List<Integer> primitiveList = new ArrayList<>();
        for (int i : primitiveArray) {
            primitiveList.add(i);
        }
        System.out.println("Primitive Array to List: " + primitiveList);

        // === 4. List to Primitive array (int[]) ===
        int[] newPrimitiveArray = primitiveList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("List to Primitive Array: " + Arrays.toString(newPrimitiveArray));
    }

}
