package Notes;

import java.util.HashMap;
import java.util.Map;

public class HashMapNote {
    public static void main(String[] args) {
        /*
        Description: A key-value pair collection that does not maintain any order.
        Methods:
        Add/Update: put(K key, V value) (if the key exists, it updates the value; otherwise, it adds a new entry)
        Delete: remove(Object key), clear()
        Get: get(Object key), containsKey(Object key), containsValue(Object value)
        Duplicates (Keys): Does not allow duplicate keys (if a duplicate key is added, the value for that key is updated).
        Duplicates (Values): Allows duplicate values.
        Order: Does not maintain any order of keys or values.
        Difference: Best for key-value pair storage with fast lookups by key. No guaranteed order of entries.
         */


        String paragraph = "Lorem Ipsum is simply dummy text of the printing and typesetting industry" +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley of" +
                " type and scrambled it to make a type specimen book It has survived not only five centuries but also " +
                "the leap into electronic typesetting, remaining essentially unchanged It was popularised in the 1960s with " +
                "the release of Letraset sheets containing Lorem Ipsum passages and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum";
        Map<String, Integer> countWords = new HashMap<>();

        /*\
         * Given a paragraph, count the occurrence of each word in the paragraph, and display the word along with the count.
         * For instance:
         * Lorem - 5
         * */

        // Loop through the string and split based on spaces

        for (String word : paragraph.split(" ")) {
            // if the word is in the map, add the word and then get the current count and increase the value count by one
            if (countWords.containsKey(word)) {
                countWords.put(word, countWords.get(word) + 1);
            } else {
                // if the word is not in the map, add the word to the map and give it a value of 1
                countWords.put(word, 1);
            }
        }

        System.out.println( countWords );

        for ( Map.Entry<String, Integer> entry : countWords.entrySet() ) {
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }

//         Find the word with min count
//         Find the word with max count
//         key and value --> take key and value

        Map.Entry<String, Integer> firstEntry = countWords.entrySet().iterator().next();
        String minWord = firstEntry.getKey();
        String maxWord = firstEntry.getKey();
        int minCount = firstEntry.getValue();
        int maxCount = firstEntry.getValue();

        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }

            if (count < minCount) {
                minCount = count;
                minWord = word;
            }
        }

        System.out.println("Word with min count is " + minWord + " with count of " + minCount);
        System.out.println("Word with max count is " + maxWord + " with count of " + maxCount);


    }


}
