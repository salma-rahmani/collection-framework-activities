import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkingWithArrayListTwo {

    public static void main(String[] args) {

        // Fill in an arrayList with random numbers
        Random random = new Random();
        List<Integer> listOfRandomNumbers = new ArrayList<>();
        int randomNumber = 0;

        // Add 15 random numbers to arrayList
        for ( int i = 1; i <= 15; i++ ) {
            randomNumber = random.nextInt( 100 ) + 1;
            listOfRandomNumbers.add(randomNumber);
        }

        System.out.println( listOfRandomNumbers );



    }

}
