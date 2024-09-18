import java.util.LinkedList;
import java.util.List;

public class LinkedListReview {

    public static void main(String[] args) {

        List<String> listOfNames = new LinkedList<>();
        LinkedList<String> listOfNamesTwo = new LinkedList<>();
        var listOfNamesThree = new LinkedList<String>();

        listOfNames.add("Bob");
        listOfNames.add("Jack");
        listOfNames.add("Trevor");
        listOfNames.add("Mike");

        System.out.println( listOfNames );

        // getting value
        System.out.println(listOfNames.get(0));

        // Modify
        listOfNames.set(0, "Commanders");


        // Delete
        listOfNames.remove("Jack");
        System.out.println( listOfNames );


        // Print all
        System.out.println( listOfNames );

//        System.out.println( listOfNames.contains("jack") );

        for ( String name : listOfNames ) {
            if ( name.equals("jack") ) {
                System.out.println("Jack is in the list");
                break;
            } else {
                System.out.println("value doesn't exist");
                break;
            }
        }


    }

}
