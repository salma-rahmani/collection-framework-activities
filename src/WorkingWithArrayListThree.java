import java.util.ArrayList;

public class WorkingWithArrayListThree {

    public static void main(String[] args) {

        ArrayList<String> listOfEmployees = new ArrayList<>();

        for ( int i = 0; i <= 15; i++ ) {
            listOfEmployees.add("Eric");
        }

        listOfEmployees.add("james");
        listOfEmployees.add("john");
        listOfEmployees.add("jack");
        listOfEmployees.add("tony");

        System.out.println( listOfEmployees );

        for ( int i = listOfEmployees.size() - 1; i >= 0; i-- ) {
            if ( listOfEmployees.get(i).equals("Eric") ) {
                listOfEmployees.remove(i);
            }
        }

        System.out.println( listOfEmployees );

    }

}
