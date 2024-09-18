import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class WorkingWithLinkedHashMap {

    public static void main(String[] args) {

        Map<Character, String> linkedHashMap = new LinkedHashMap<>();
        Map<Character, String> treeMap = new TreeMap<>();
        Map<Integer, String> students = new TreeMap<>();
        Map<String, Integer> employee = new TreeMap<>();

        // * * * * * * * * Linked Hash Map * * * * * * * *

        linkedHashMap.put('H', "Bob");
        linkedHashMap.put('A', "Bob");
        linkedHashMap.put('C', "Bob");
        linkedHashMap.put('B', "Bob");
        linkedHashMap.put(null, "Tony");
        linkedHashMap.put('J', null);

        System.out.println( linkedHashMap );


        // * * * * * * * * Tree Map * * * * * * * *

        treeMap.put('H', "Bob");
        treeMap.put('A', "Bob");
        treeMap.put('C', "Bob");
        treeMap.put('B', "Bob");
        treeMap.put('L', "Tony");

        System.out.println( treeMap );


        // * * * * * * * * Tree Map * * * * * * * *

        students.put(250, "Bob");
        students.put(1, "Killy");
        students.put(3, "Jack");
        students.put(0, "James");


        System.out.println( students );

        // * * * * * * * * Tree Map * * * * * * * *

        employee.put("Bob", 25_000 );
        employee.put("Tony", 25_000 );
        employee.put("Abraham", 25_000 );


        System.out.println( employee );





    }

}
