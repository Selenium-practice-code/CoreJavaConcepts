package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> pLanguage = new ArrayList<String>();
        pLanguage.add("Java");
        pLanguage.add("Python");
        pLanguage.add("C++");
        pLanguage.add("Swift");

        ArrayList<String> tools = new ArrayList<String>();
        tools.add("Testing");
        tools.add("Dev ops");

          //addAll Method : Combine two ArrayList
//        pLanguage.addAll(tools);
//        System.out.println(pLanguage); // [Java, Python, C++, Swift, Testing, Dev ops]
//
//        //If you want to addAll values using Index wise
//        pLanguage.addAll(3, tools);
//        System.out.println(pLanguage); //[Java, Python, C++, Testing, Dev ops, Swift]
//
//        // Clear Method : Clear all the arrayList or create Empty arrayList
//        pLanguage.clear();
//        System.out.println(pLanguage);

        // Clone Method : it will return one Object
        ArrayList<String> cloneList = (ArrayList<String>) pLanguage.clone();
        System.out.println(cloneList);

        // Contains Method : if it will contain anything(to check the element is present or not in ArrayLIst)
        // than it will return True otherwise return False
        System.out.println(pLanguage.contains("C++"));
        System.out.println(pLanguage.contains("C"));

        //IndexOf Method : Check the index of the element and also check the particular element is available in
        // ArrayList or Not
        System.out.println(pLanguage.indexOf("Swift")); // Index Position : 3
        System.out.println(pLanguage.indexOf("Swift") > 0); // return True or False

        //LastIndexOF Method : Check the Last Index of particular element
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Sumit", "Mansi", "Sumit", "Richa", "Sumit"));
        System.out.println(list);
        System.out.println(list.lastIndexOf("Sumit")); // 4
        System.out.println(list.lastIndexOf("Rohit")); //-1 if there is no such index or Element

        // Remove method : remove the element in arraylist
        list.remove(2);
        list.remove("Sumit");
        System.out.println(list);

        //RemoveIf Method :- Bases of condition we can remove the element
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // numbers.removeIf(num -> num % 2 == 0);   // means give me some condition
        numbers.removeIf(num -> num % 2 == 1);   // means give me some condition
        System.out.println(numbers);

        //Retain method :
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("A", "B", "C", "A"));
        System.out.println(nameList);

        // retain only those values which you are expecting with the particular Collections so SingleTon method
        //you have to use it
        nameList.retainAll(Collections.singleton("A"));
        System.out.println(nameList);

        // How to create a sub-list
        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

        ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 6));// (0, 6-1)
        System.out.println(subList);

        // How Convert ArrayList in to Array
        ArrayList<String> charList = new ArrayList<String>(Arrays.asList("AB", "BC", "CD", "DA"));

        Object arr[] = charList.toArray();
        System.out.println(Arrays.toString(arr));


        for (Object o : arr) {
            System.out.println((String) o);
        }

    }
}
