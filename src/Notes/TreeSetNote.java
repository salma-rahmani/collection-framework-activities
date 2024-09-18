package Notes;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetNote {
    public static void main(String[] args) {
        /*
        Description: A Set that orders elements using their natural ordering or a custom comparator.
        Methods:
        Add: add(E e)
        Delete: remove(Object o), clear()
        Update: No direct update method. Remove and add the updated element.
        Get: You can use methods like first(), last(), higher(E e), lower(E e) for specific elements,
        but generally, you need to iterate.Duplicates: Does not allow duplicates.
        Order: Orders elements based on their natural order (e.g., numerical or lexicographical for String)
        or a custom comparator.
        Difference: Good for sorted data, providing log-time complexity for most operations.
        The elements are always sorted, unlike HashSet and LinkedHashSet. No duplicates allowed.

         */
        Set<String> treeSetOfName = new TreeSet<>();
        Set<Integer> treeSetOfNumber = new TreeSet<>();
        // Add
        treeSetOfName.add("James");
        treeSetOfName.add("Matt");
        treeSetOfName.add("Bob");
        treeSetOfName.add("Jack");

        // Print elements
        System.out.println(treeSetOfName);

        treeSetOfNumber.add(10);
        treeSetOfNumber.add(0);
        treeSetOfNumber.add(5);
        treeSetOfNumber.add(1);
        treeSetOfNumber.add(2);

        System.out.println(treeSetOfNumber);
    }
}
