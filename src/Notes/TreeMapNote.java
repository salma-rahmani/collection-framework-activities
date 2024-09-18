package Notes;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapNote {
    public static void main(String[] args) {
        /*
        8. TreeMap
        Description: A Map that orders the entries based on the natural ordering of the keys or
        by a comparator provided at the map's creation.
        Methods:
        Add/Update: put(K key, V value)
        Delete: remove(Object key), clear()
        Get: get(Object key), firstKey(), lastKey(), higherKey(K key), lowerKey(K key)
        Duplicates (Keys): Does not allow duplicate keys (similar to HashMap, adding a duplicate key
        updates the value).
        Duplicates (Values): Allows duplicate values.
        Order: Keys are sorted in natural order or by a provided comparator.
        Difference: Useful when you need a sorted Map. Slower than HashMap and LinkedHashMap due to sorting.
         */
        Map<String, Integer> fruitPrices = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        fruitPrices.put("Cherry", 70);
        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 20);
        System.out.println(fruitPrices); // {Apple=50, Banana=20, Cherry=70} (sorted by key)

        // Retrieve a value using its key
        int applePrice = fruitPrices.get("Apple");
        System.out.println("Price of Apple: " + applePrice); // Price of Apple: 50

        // Get the first (lowest) key
        String firstKey = ((TreeMap<String, Integer>) fruitPrices).firstKey();
        System.out.println("First key: " + firstKey); // First key: Apple

        // Remove a key-value pair by key
        fruitPrices.remove("Banana");
        System.out.println(fruitPrices); // {Apple=50, Cherry=70}
    }

}
