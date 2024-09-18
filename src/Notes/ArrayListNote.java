package Notes;

import java.util.ArrayList;

public class ArrayListNote {
    public static void main(String[] args) {

    /*
    ArrayList
        Description: Resizable array, part of the List interface.
                 Methods:
                Add: add(E e), add(int index, E element)
                Delete: remove(Object o), remove(int index), clear()
                Update: set(int index, E element)
                Get: get(int index)

        Duplicates: Allows duplicates.
        Order: Maintains the order of insertion (index-based, like an array).

*/
        ArrayList<String> listOfEmployees = new ArrayList<>();

        for (int i = 0; i <= 15; i++) {
            listOfEmployees.add("Eric");
        }

        listOfEmployees.add("james");
        listOfEmployees.add("john");
        listOfEmployees.add("jack");
        listOfEmployees.add("tony");


        System.out.println(listOfEmployees);

        for (int i = listOfEmployees.size() - 1; i >= 0; i--) {
            if (listOfEmployees.get(i).equals("Eric")) {
                listOfEmployees.remove(i);
            }
        }

        System.out.println(listOfEmployees);
//        listOfEmployees.clear();
//        System.out.println(listOfEmployees);
        listOfEmployees.set(2, "Salma");
        System.out.println(listOfEmployees);


    }
}