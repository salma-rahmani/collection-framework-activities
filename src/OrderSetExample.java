import java.util.LinkedHashSet;
import java.util.Set;

public class OrderSetExample {

    public static void main(String[] args) {

        // Create an object of HashSet
        Set<String> setOfNames = new LinkedHashSet<>();
        Set<Integer> setOfNumbers = new LinkedHashSet<>();
        Set<Character> setOfCharacters = new LinkedHashSet<>();

        String oldValue = "Eric";
        String newValue = "Killy";

        // Add elements to set
        setOfNames.add("Bob");
        setOfNames.add("Tony");
        setOfNames.add("Eric");
        setOfNames.add("Jasmine");
        setOfNames.add(null);


        setOfNumbers.add(10);
        setOfNumbers.add(250);
        setOfNumbers.add(6);
        setOfNumbers.add(0);
        setOfNumbers.add(1);


        setOfCharacters.add('H');
        setOfCharacters.add('A');
        setOfCharacters.add('Y');
        setOfCharacters.add('Z');
        setOfCharacters.add('O');
        setOfCharacters.add('B');

        // Print elements
        System.out.println( setOfNames );

        // Print elements of number set
        System.out.println( setOfNumbers );

        // print elements of character set
        System.out.println( setOfCharacters );


    }

}
