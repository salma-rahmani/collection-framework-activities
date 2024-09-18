package Notes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapNote {
    public static void main(String[] args) {
        /*
        Description: A key-value pair collection that maintains the insertion order.
        Methods:
        Add/Update: put(K key, V value)
        Delete: remove(Object key), clear()
        Get: get(Object key), containsKey(Object key), containsValue(Object value)
        Duplicates (Keys): Does not allow duplicate keys (similar to HashMap, adding a duplicate
        key updates the value).
        Duplicates (Values): Allows duplicate values.
        Order: Maintains the order of insertion (predictable iteration order of keys and values).
        Difference: Similar to HashMap, but with predictable insertion order for keys and values.
        Slightly slower than HashMap due to the extra overhead of maintaining a linked list to preserve order.
         */
        Map<Character, String> linkedHashMap = new LinkedHashMap<>();
        Map<Character, String> treeMap = new TreeMap<>();
        Map<Integer, String> students = new TreeMap<>();
        Map<String, Integer> employee = new TreeMap<>();

        // * * * * * * * * Linked Hash Map * * * * * * * *

        linkedHashMap.put('H', "Bob");
        linkedHashMap.put('A', "Bob");
        linkedHashMap.put('C', "Bob");
        linkedHashMap.put('B', "Bob");
        linkedHashMap.put(null, "Tony");
        linkedHashMap.put('J', null);

        System.out.println( linkedHashMap );


        // * * * * * * * * Tree Map * * * * * * * *

        treeMap.put('H', "Bob");
        treeMap.put('A', "Bob");
        treeMap.put('C', "Bob");
        treeMap.put('B', "Bob");
        treeMap.put('L', "Tony");

        System.out.println( treeMap );


        // * * * * * * * * Tree Map * * * * * * * *

        students.put(250, "Bob");
        students.put(1, "Killy");
        students.put(3, "Jack");
        students.put(0, "James");


        System.out.println( students );

        // * * * * * * * * Tree Map * * * * * * * *

        employee.put("Bob", 25_000 );
        employee.put("Tony", 25_000 );
        employee.put("Abraham", 25_000 );


        System.out.println( employee );

    }
}
