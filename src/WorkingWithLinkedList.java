import java.util.LinkedList;

public class WorkingWithLinkedList {

    public static void main(String[] args) {

        LinkedList<String> listOfEmployees = new LinkedList<>();

        // add elements to linked list
        listOfEmployees.add("Tony");
        listOfEmployees.add("John");
        listOfEmployees.add("Mike");

        // Print elements
        System.out.println( listOfEmployees );

        // Add more elements
        listOfEmployees.add(1, "Eric");

        // Print elements of linked list
        System.out.println( listOfEmployees );

        // Remove value
        listOfEmployees.remove("Eric");

        System.out.println( listOfEmployees );

        // listOfEmployees.addLast();

    }

}
