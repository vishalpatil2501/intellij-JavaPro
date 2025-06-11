package Collections;

import java.util.ArrayList;


public class arraylist1 {
    public static void main(String[] args) {

        // Creating an ArrayList
      ArrayList list = new ArrayList();
      ArrayList <String> l1 = new ArrayList<String>();
      ArrayList <Integer> l2 = new ArrayList<Integer>();

        // 1. Adding elements
         list.add(100);
         list.add("Vishal");
         list.add('p');
         list.add("Vishal");
         list.add(null);
         list.add(0,"Patil");
         list.add(null);


         // Reading all element
         System.out.println("After adding elements: " + list);
         for(int i=0; i<list.size(); i++){
             System.out.print(" " + list.get(i));
         }

        System.out.println();

         for(Object x : list){
             System.out.print(" " + x);
         }
        System.out.println();

        // 2. Accessing elements
        System.out.println("2nd ele: " +list.get(1));

        // 3. Removing elements
        list.remove(1);
        System.out.println("After removing index1: " + list);
        list.remove("Patil");
        System.out.println("After removing Patil: " + list);

        // 4. Searching for elements
        System.out.println("Contains Vishal? " + list.contains("Vishal"));  // true
        System.out.println("Index of p: " + list.indexOf('p'));  // 1

        // 5. Checking size and emptiness
        System.out.println("Size of list: " + list.size());  // 5
        System.out.println("Is list empty? " + list.isEmpty());  // false

        // 6. Clearing the list
        list.clear();
        System.out.println("After clearing: " + list);  // []




    }
}
