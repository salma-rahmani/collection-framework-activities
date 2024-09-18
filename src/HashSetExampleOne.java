import java.util.HashSet;

public class HashSetExampleOne {

    public static void main(String[] args) {

        // Create an object of HashSet
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
        System.out.println( setOfNames );

        // Remove element from set
        setOfNames.remove("Jasmine");

        // Print the elements of set
        System.out.println( setOfNames );

        for ( String name : setOfNames ) {
            System.out.print( name + " " );
        }

        // get the size of the set
        System.out.println( setOfNames.size() );

        System.out.println( setOfNames.isEmpty() );

        // setOfNames.removeAll(setOfNames);

        System.out.println( setOfNames.isEmpty() );

        if ( setOfNames.contains(oldValue) ) {
            setOfNames.remove(oldValue);
        }

        setOfNames.add(newValue);

        // Print the elements of set
        System.out.println( setOfNames );


    }

}
