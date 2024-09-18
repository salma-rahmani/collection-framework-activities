import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetReview {

    public static void main(String[] args) {

        Set<String> setOfNames = new HashSet<>();
        Set<String> linkedListOfNames = new LinkedHashSet<>();
        Set<String> treeSetOfName = new TreeSet<>();
        Set<Integer> treeSetOfNumber = new TreeSet<>();
//        HashSet<String> setOfNamesTwo = new HashSet<>();
//        var setOfNamesThree= new HashSet<String>();

        // Add
        setOfNames.add("Bob");
        setOfNames.add("Jack");
        setOfNames.add("James");
        setOfNames.add("Matt");

        // Print elements
        System.out.println( setOfNames );

        setOfNames.remove("James");

        System.out.println( setOfNames );


        System.out.println( setOfNames.isEmpty() );

        System.out.println( setOfNames.size() );

//        for ( String name : setOfNames ) {
//            if ( name.equals("Bob") ) {
//                setOfNames.remove(name);
//            }
//        }
        setOfNames.remove("Bob");
        setOfNames.add("Killy");

        System.out.println( setOfNames );

        for ( String name : setOfNames ) {
            System.out.println( name );
        }

        setOfNames.add(null);
        setOfNames.add(null);


        System.out.println( setOfNames );


        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

        // Add
        linkedListOfNames.add("Bob");
        linkedListOfNames.add("Jack");
        linkedListOfNames.add("James");
        linkedListOfNames.add("Matt");

        // Print elements
        System.out.println( linkedListOfNames );

        linkedListOfNames.remove("Bob");

        linkedListOfNames.add(null);
        linkedListOfNames.add(null);

        System.out.println( linkedListOfNames );


        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

        // Add
        treeSetOfName.add("James");
        treeSetOfName.add("Matt");
        treeSetOfName.add("Bob");
        treeSetOfName.add("Jack");
//        treeSetOfName.add(null);


        // Print elements
        System.out.println( treeSetOfName );

        treeSetOfNumber.add(10);
        treeSetOfNumber.add(0);
        treeSetOfNumber.add(5);
        treeSetOfNumber.add(1);
        treeSetOfNumber.add(2);

        System.out.println( treeSetOfNumber );





    }

}
