import java.util.ArrayList;
import java.util.List;
/*
* package
* import
* class
* */


public class WorkingWithArrayList {

    public static void main(String[] args) {

        // Create object of list collection --> ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        List<String> listOfEmployees = new ArrayList<>();
        List<String> listOfStudents = new ArrayList<>();
        var listOfNumbers = new ArrayList<Integer>();

        // Add values or elements to list
        listOfEmployees.add("John");
        listOfEmployees.add("Eric");
        listOfEmployees.add("Jack");
        listOfEmployees.add("Tony");
        listOfEmployees.add("Jack");



        // Print the elements of list
        System.out.println( listOfEmployees );

        // Add elements or values to specific location or index
        listOfEmployees.add(1, "Mike");

        // Print the updated list
        System.out.println( listOfEmployees );

        // Print elements of list of students
        System.out.println( listOfStudents );

        // add from one collection to another
        listOfStudents.addAll(listOfEmployees);

        // Print elements of list of students
        System.out.println( listOfStudents );


        // Remove elements from list
        listOfEmployees.remove("Jack");

        // Print the updated list
        System.out.println( listOfEmployees );

        // Remove elements from list using indexes
        listOfEmployees.remove(3);

        listOfEmployees.add("Eric");
        listOfEmployees.add("Jack");
        listOfEmployees.add("Eric");
        listOfEmployees.add("Lyla");
        listOfEmployees.add("Eric");

        // Print the updated list
        System.out.println( listOfEmployees );

        // Remove all values of collections
       // listOfEmployees.removeAll(listOfEmployees);

        // Print updated list
        System.out.println( listOfEmployees );

        // Print specific element of list
        System.out.println( listOfEmployees.get(2) );

        // Modify value of list
        listOfEmployees.set(0, "Commanders");

        System.out.println( listOfEmployees );

        // Using for each loop to iterate through the elements of a collection
//        for ( String element : listOfEmployees ) {
//            System.out.println(element);
//        }

        // Using for loop to iterate through the elements of a collection
//        for ( int i = 0; i < listOfEmployees.size(); i++ ) {
//             System.out.println( listOfEmployees.get(i) );
//        }

        for ( String value : listOfEmployees ) {
            if ( value.equals("Eric") ) {
                listOfEmployees.remove(value);
            }
        }

        System.out.println( listOfEmployees );

        listOfEmployees.set( listOfEmployees.size() - 1, "Commanders" );
        listOfEmployees.set( 0, "Eric" );

        System.out.println( listOfEmployees );


    }

}
