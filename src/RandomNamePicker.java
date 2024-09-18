import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNamePicker {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();
        Random random = new Random();

        listOfNames.add("Bob");
        listOfNames.add("Jack");
        listOfNames.add("Eric");
        listOfNames.add("Tony");
        listOfNames.add("Samanta");
        listOfNames.add("Mike");
        listOfNames.add("Killy");
        listOfNames.add("Trevor");


        // print the names
        System.out.println( listOfNames.get( random.nextInt( listOfNames.size() - 1 ) + 0 ) );

    }

}
