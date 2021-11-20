package Collections.List.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 4, 5, 1, 6, 7, 8, 6, 9, 10));
        System.out.println("List of Duplicate Values: " + numbers);

        //Using LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);

        ArrayList<Integer> newNumbers = new ArrayList<Integer>(linkedHashSet);
        System.out.println("List of without Duplicate Values: " + newNumbers);

        //Using Streams
        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 4, 5, 1, 6, 7, 8, 6, 9, 10));
        List<Integer> uniqueMarksList = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println("unique Marks List is : " + uniqueMarksList);

    }
}
