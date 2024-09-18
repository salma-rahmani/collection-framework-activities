import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

    public static void main(String[] args) {

        // Create
        Map<Integer, String> studentInformation = new HashMap<>();
        HashMap<Integer, String> StudentInformationTwo = new HashMap<>();
        var StudentInformationThree = new HashMap<Integer, String>();
        /*
        * Id, Name
        * 1 - Bob
        * 2 - Jack
        * */

        // Add elements to map
        studentInformation.put(1, "Bob");
        studentInformation.put(2, "Jack");
        studentInformation.put(3, "Jasmine");
        studentInformation.put(4, "Jasmine");

        // Print entries of map
        System.out.println( studentInformation );

        // Update elements from map
        studentInformation.put(1, "Trevor");
        studentInformation.put(1, "Bob Morphy");

        // Print entries of map
        System.out.println( studentInformation );

        // Print specific value
        System.out.println( studentInformation.get(2) );
        System.out.println( studentInformation.get(4) );

        // Remove elements
        studentInformation.remove(1);
        studentInformation.remove(2, "Jack");

        // Print entries of map
        System.out.println( studentInformation );

        // Add more values
        studentInformation.put(5, "Mike");
        studentInformation.put(6, "Tony");

        System.out.println( studentInformation );

        System.out.println( studentInformation.containsKey(3) );
        System.out.println( studentInformation.containsValue("Jasmine") );
        System.out.println( studentInformation.containsKey(10) );
        System.out.println( studentInformation.containsValue("Commanders") );

        // Print keys of map
        System.out.println( studentInformation.keySet() );

        // Print values of mao
        System.out.println( studentInformation.values() );

        // Print keys using loop
        for ( int key : studentInformation.keySet() ) {
            System.out.print( key + ", " );
        }

        System.out.println();

        // Print values using loop
        for ( String value : studentInformation.values() ) {
            System.out.print( value + ", " );
        }

        System.out.println();

        // Print count of all entries
        System.out.println( studentInformation.entrySet() );

        System.out.println( "You have " + studentInformation.size() + " entries in your map. " );

        // Check if map is empty or not
        System.out.println( studentInformation.isEmpty() );

//
//        for ( Map.Entry<Integer, String> entry : studentInformation.entrySet()  ) {
//            System.out.println( entry.getKey() + " = " + entry.getValue() );
//        }

        // Remove all entries of map
         studentInformation.clear();

        System.out.println( studentInformation );

    }

}
