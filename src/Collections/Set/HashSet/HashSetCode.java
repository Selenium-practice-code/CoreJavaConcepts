package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetCode {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add(null);

        System.out.println(set);// Print all set and it not maintains any order
        System.out.println(set.contains("Apple")); //Give True if element is present

        System.out.println("-----------------");
        //Print value using for each loop
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-----------------");
        //Remove value
        set.remove(null);
        System.out.println(set);
    }
}
