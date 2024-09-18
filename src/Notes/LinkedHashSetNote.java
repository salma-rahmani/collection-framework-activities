package Notes;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetNote {
    public static void main(String[] args) {
        /*
        Description: Maintains the insertion order of elements, part of the Set interface.
        Methods:
        Add: add(E e)
        Delete: remove(Object o), clear()
        Update: Same as HashSet, there is no direct update method.
        Get: No direct get method; iterate to retrieve elements.

        Duplicates: Does not allow duplicates.
        Order: Maintains the order of insertion (preserves the order in which elements were added).
        Difference: Similar to HashSet, but with predictable iteration order (insertion order).
        Slightly slower than HashSet because it maintains a linked list to keep track of insertion order.
         */
        Set<String> fruits = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits); // [Apple, Banana, Cherry]

        // Try adding a duplicate element
        boolean isAdded = fruits.add("Apple");
        System.out.println(isAdded); // false

        // Check if an element exists
        boolean containsApple = fruits.contains("Apple");
        System.out.println(containsApple); // true

        // Remove an element
        fruits.remove("Banana");
        System.out.println(fruits); // [Apple, Cherry]
    }
}
