import java.util.Set;
import java.util.TreeSet;

public class OrderSetExampleTwo {

    public static void main(String[] args) {

        // Create an object of HashSet
        Set<String> setOfNames = new TreeSet<>();
        Set<Integer> setOfNumbers = new TreeSet<>();
        Set<Character> setOfCharacters = new TreeSet<>();

        String oldValue = "Eric";
        String newValue = "Killy";

        // Add elements to set
        setOfNames.add("Bob");
        setOfNames.add("Tony");
        setOfNames.add("Eric");
        setOfNames.add("Jasmine");
       //  setOfNames.add(null);


        setOfNumbers.add(10);
        setOfNumbers.add(250);
        setOfNumbers.add(6);
        setOfNumbers.add(0);
        setOfNumbers.add(1);
        setOfNumbers.add(2);


        setOfCharacters.add('H');
        setOfCharacters.add('A');
        setOfCharacters.add('Y');
        setOfCharacters.add('Z');
        setOfCharacters.add('O');
        setOfCharacters.add('B');
        setOfCharacters.add('C');

        // Print elements
        System.out.println( setOfNames );

        // Print elements of number set
        System.out.println( setOfNumbers );

        // print elements of character set
        System.out.println( setOfCharacters );


    }

}
