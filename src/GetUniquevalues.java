import java.util.HashSet;
import java.util.Set;

public class GetUniquevalues {

    public static void main(String[] args) {

        String[] names = { "Bob", "Jack", "Bob", "Jack", "Tony", "Trevor", "Mike" };
        int[] numbers = { 10, 10, 2, 3, 4, 1, 0, 1, 3, 2, 7, 8, 55, 10, 190, 180, 200 };
        Set<String> uniqueNames = new HashSet<>();
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<String> duplicateNames = new HashSet<>();
//      HashSet<DataType> uniqueNumbers = new HashSet<>();

        for ( String name : names ) uniqueNames.add(name);
        for ( int number : numbers ) uniqueNumbers.add(number);

        System.out.println( uniqueNames );
        System.out.println( uniqueNumbers );

        // Which values are duplicate?
        for ( String name : names ) {
            // if you cannot add a value to set, it means that value is a duplicate value. Just print it into the console.
            if ( !(duplicateNames.add(name)) ) {
                System.out.println(name);
            }
        }

    }

}
