import java.util.HashMap;
import java.util.Map;

public class ReviewMap {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Bob"); // entry --> entrySet()
        names.put(2, "Jack");
        names.put(3, "Killy");
        names.put(4, "Tony");
        names.put(5, "Jasmine");
        names.put(6, "Mike");
//        names.put(null, null);
//        names.put(4, null);
//        names.put(0, "Trevor");

//        System.out.println( names );
//
//        names.put(10, "James");
//
//        System.out.println( names );
//
//        System.out.println( names.get(2) ); // Jack
//
//        System.out.println( names.keySet() );
//
//        System.out.println( names.values() );

        System.out.println(names.entrySet() );

//        System.out.println( names.remove(10) );

//        names.remove(10, "James");
//
//        System.out.println( names );
//
        System.out.println( "ID " + "Name"  );
       for  ( Map.Entry<Integer, String> entry : names.entrySet() ) {
           System.out.println( entry.getKey() + "  " + entry.getValue() );
       }
//
//        System.out.println( names.size() );
//
//        System.out.println( names.isEmpty() );
//
//         names.clear();
//
//        System.out.println( names );

        System.out.println( names.keySet() );

//       OUTER: for ( Map.Entry<Integer, String> entry : names.entrySet() ) {
//            int iterations = 1; // 1
//            INNER: for ( int i = 1; i <= 1; i++ ) {
//                System.out.println(entry.getKey() + " = " + entry.getValue());
//                iterations++;
//            }
//            if ( iterations == 3 ) {
//                break OUTER;
//            }
//        }

//        for ( Map.Entry<Integer, String> entry : names.entrySet() ) {
//            if ( entry.getValue().equals("Jack") ) {
//                System.out.println( entry );
//                break;
//            } else {
//                System.out.println( entry );
//            }
//        }

//        for ( Map.Entry<Integer, String> entry : names.entrySet() ) {
//          if ( entry.getKey() <= 2 ) {
//              System.out.println( entry );
//          } else {
//              break;
//          }
//        }

//        System.out.println( names.get(2) );

        for ( Map.Entry<Integer, String> entry : names.entrySet() ) {
           if ( entry.getKey() >= 2 ) {
               System.out.println( entry );
           }
        }

        for ( int key = 3; key <= names.size(); key ++  ) {
            System.out.println(  key + " = " + names.get( key ) );
        }

        // 2 --> entryKey <= size();

        /*]
         * ID Name
         * 1  Bob
         * 2 Jack
         * */


    }

}
