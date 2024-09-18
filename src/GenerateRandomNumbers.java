import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateRandomNumbers {

    public static void main(String[] args) {

        // generate 15 unique random numbers
        // print unique names
        String[] names = { "Bob", "Jack", "Bob", "Jack", "Tony", "Trevor", "Mike" };
        int[] numbers = { 10, 10, 2, 3, 4, 1, 0, 1, 3, 2, 7, 8, 55, 10, 190, 180, 200 };
        List<String> uniqueNames = new ArrayList<>();
        List<Integer> uniqueNumbers = new ArrayList<>();

        for ( int i = 0; i < names.length; i++ ) {
            // if the value exist in the list, do not add and just move on , --> contains()
            if ( uniqueNames.contains( names[i] ) ){} else {
                // or if the value doesn't exist, add it to the list
                uniqueNames.add(names[i]);
            }
        }
        System.out.println( uniqueNames );

        for ( int number : numbers ) {
            if ( uniqueNumbers.contains( number ) ) {} else {
                uniqueNumbers.add(number);
            }
        }

        Collections.sort(uniqueNumbers);

        System.out.println( uniqueNumbers );

    }

}
