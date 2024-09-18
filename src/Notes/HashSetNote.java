package Notes;

import java.util.HashSet;

public class HashSetNote {
    public static void main(String[] args) {
        /*
        Description: A collection that does not allow duplicate elements. Part of the Set interface.
        Methods:
        Add: add(E e)
        Delete: remove(Object o), clear()
        Update: Since HashSet does not maintain order, there is no direct update method. You can remove and re-add an updated element.
        Get: No direct get method since HashSet does not maintain an order. You can iterate over the elements.

        Duplicates: Does not allow duplicates (if you add a duplicate, it will overwrite the existing
        element).
        Order: Does not maintain any order (elements are stored based on their hash codes).
        Difference: Best for fast access, insertion, and removal of unique elements (no duplicates).
        No guaranteed order.

         */

        HashSet<String> setOfNames = new HashSet<>();
        String oldValue = "Eric";
        String newValue = "Killy";

        // Add elements to set
        setOfNames.add("Bob");
        setOfNames.add("Tony");
        setOfNames.add("Eric");
        setOfNames.add("Jasmine");
        setOfNames.add("Jasmine");
        setOfNames.add(null);
        setOfNames.add(null);

        // System.out.println( setOfNames.add("Jasmine") );

        // Print the elements of set
        System.out.println(setOfNames);

        // Remove element from set
        setOfNames.remove("Jasmine");

        // Print the elements of set
        System.out.println(setOfNames);

        for (String name : setOfNames) {
            System.out.print(name + " ");
        }

        // get the size of the set
        System.out.println(setOfNames.size());

        System.out.println(setOfNames.isEmpty());

        // setOfNames.removeAll(setOfNames);

        System.out.println(setOfNames.isEmpty());

        if (setOfNames.contains(oldValue)) {
            setOfNames.remove(oldValue);
        }

        setOfNames.add(newValue);

        // Print the elements of set
        System.out.println(setOfNames);

    }
}
