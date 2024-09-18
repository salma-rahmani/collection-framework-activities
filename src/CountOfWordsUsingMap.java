import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CountOfWordsUsingMap {

    public static void main(String[] args) {

        String paragraph = "Lorem Ipsum is simply dummy text of the printing and typesetting industry" +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley of" +
                " type and scrambled it to make a type specimen book It has survived not only five centuries but also " +
                "the leap into electronic typesetting, remaining essentially unchanged It was popularised in the 1960s with " +
                "the release of Letraset sheets containing Lorem Ipsum passages and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum";

        Map<String, Integer> countWords = new HashMap<>();

        for ( String word : paragraph.split(" ") ) countWords.merge(word, 1, Integer::sum);
        countWords.forEach( ( k, v ) -> System.out.println( k + " - " + v ) );

        // Find the word with min count
        // Find the word with max count
        // key and value --> take key and value

        Optional<Map.Entry<String, Integer>> minEntry = countWords.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue());

        Optional<Map.Entry<String, Integer>> maxEntry = countWords.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        minEntry.ifPresent( entry ->
                System.out.println( "Word with minimum count is: " + entry.getKey() + " count is " + entry.getValue() )
        );

        maxEntry.ifPresent( entry ->
                System.out.println( "Word with maximum count is: " + entry.getKey() + " count is " + entry.getValue() )
        );


    }

}
