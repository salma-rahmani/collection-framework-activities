package Notes;

import java.util.LinkedList;
import java.util.List;

public class LinkedListNote {
    public static void main(String[] args) {
        /*
        Description: Doubly linked list implementation of the List and Deque interfaces.
        Methods:
        Add: add(E e), addFirst(E e), addLast(E e), offer(E e), offerFirst(E e), offerLast(E e)
        Delete: remove(Object o), remove(int index), removeFirst(), removeLast(), clear()
        Update: set(int index, E element)
        Get: get(int index), getFirst(), getLast()

        Duplicates: Allows duplicates.
        Order: Maintains the order of insertion (doubly linked list).
        Difference: Best for frequent inserts and deletes at the beginning or end (better than ArrayList),
        but slower for random access because it must traverse the list.
         */

        List<String> listOfNames = new LinkedList<>();
        LinkedList<String> listOfNamesTwo = new LinkedList<>();
        var listOfNamesThree = new LinkedList<String>();

        listOfNames.add("Bob");
        listOfNames.add("Jack");
        listOfNames.add("Trevor");
        listOfNames.add("Mike");

        System.out.println(listOfNames);

        // getting value
        System.out.println(listOfNames.get(0));

        // Modify
        listOfNames.set(0, "Commanders");


        // Delete
        listOfNames.remove("Jack");
        System.out.println(listOfNames);


        // Print all
        System.out.println(listOfNames);

//        System.out.println( listOfNames.contains("jack") );

        for (String name : listOfNames) {
            if (name.equals("jack")) {
                System.out.println("Jack is in the list");
                break;
            } else {
                System.out.println("value doesn't exist");
                break;
            }
        }
    }
}