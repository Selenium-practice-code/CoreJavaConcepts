package Collections.List.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

    public static void main(String[] args) {

        //!. Sort then equals
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "D", "E", "C"));

        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "E", "D"));

        Collections.sort(l1);
        Collections.sort(l2);

        if (l1.equals(l2))
            System.out.println("Array List are equal");
        else
            System.out.println("Array list not equal");

        //2. Compare two list : Find out additional Element
        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A", "B", "D", "E", "C"));

        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "E", "F"));

//        l3.removeAll(l4);
//        System.out.println(l3); //D

        //3. Find Out missing Element
        l4.removeAll(l3);
        System.out.println(l4); // F

        //Find out common element
        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "Ruby", "C#", "JS"));
        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "Ruby", "C#", "PHP"));

        lang1.retainAll(lang2);
        System.out.println(lang1);


    }
}
