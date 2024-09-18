import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacters {

    public static void main(String[] args) {

        String message = "Welcome to java class!";
        Map<Character, Integer> countOfCharacters = new HashMap<>();
        /*
        * W - 1
        * e - 2
        * */

        for ( char character : message.replace(" ", "").toCharArray() ) {
            // if the character exists in my map, get the current count, and add 1 to it
            if ( countOfCharacters.containsKey(character) ) {
                countOfCharacters.put(character, countOfCharacters.get(character) + 1);
            } else {
                // if not, add the character and give it the count of 1
                countOfCharacters.put(character, 1);
            }
        }
//
//        for ( Map.Entry<Character, Integer> entry : countOfCharacters.entrySet() ) {
//            System.out.println( entry.getKey() + " - " + entry.getValue() );
//        }

        countOfCharacters.forEach( ( k, v ) -> System.out.println( k + " - " + v ));

    }

}
