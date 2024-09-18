import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListReview {

    public static void main(String[] args) {

        /*
         * List
         *  ArrayList
         *  LinkedList
         *  Vector
         *  Stack
         * */

        // String[] names = new String[10];
        //ArrayList<String> listOfNames = new ArrayList<>();
        List<String> listOfNames = new ArrayList<>();
        List<Integer> listOfRandomNumbers = new ArrayList<>();
//        var listOfNames = new ArrayList<String>();
//        ArrayList<String> listOfNames = new ArrayList<String>();
        var input = new Scanner(System.in);
        var random = new Random();
        int randomNumber = 0;

//        for ( int i = 1; i <= 3; i++ ) {
//            System.out.println("What is your first name: ");
//            listOfNames.add( input.next() );  // "John"  listOfNames.add("John");
//        }
//
//        System.out.println( listOfNames );

        for (int i = 1; i <= 15; i++) {
            randomNumber = random.nextInt(10) + 1;
            listOfRandomNumbers.add(randomNumber);

        }
        System.out.println(listOfRandomNumbers);


    }

}
