package Collections.Set.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCode {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
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

        System.out.println("-----------------");
        //Print using Iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String fruits = iterator.next();
            System.out.println(fruits);
        }

        System.out.println("-----------------");
        Set<Integer> firstSet = new HashSet<>(); // Create a integer set
        firstSet.addAll(Arrays.asList(new Integer[]{1, 3, 4, 5, 6, 8, 9, 10}));

        Set<Integer> secondSet = new HashSet<>(); // Create a integer set
        firstSet.addAll(Arrays.asList(new Integer[]{1, 2, 3, 5, 6, 7, 9, 0}));

        //get the Union:
        Set<Integer> union = new HashSet<>(firstSet);
        union.addAll(secondSet);
        //Print entire Union
        System.out.println(union); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------------");
        //Get interaction:
        Set<Integer> intersection = new HashSet<Integer>(firstSet);
        intersection.retainAll(secondSet);
        System.out.println(intersection);

        System.out.println("-----------------");
        //Get Differences:
        Set<Integer> diff = new HashSet<>(firstSet);
        diff.removeAll(secondSet);
        System.out.println(diff);
    }
}
