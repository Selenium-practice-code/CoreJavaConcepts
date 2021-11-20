package Collections.List.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListMethods {

    public static void main(String[] args) {

        /**
         * LL in default class in Java
         * it can be used as List, Stack, Queue
         * It allow the null entry
         * dynamic collection
         * it can contain duplicate element
         * it not thread safe and synchronized
         * manipulation is fast because we don't need shifting
         * LL constructors:
         * LinkList()
         * LinkList(Collection c)
         */

        LinkedList<String> nameList = new LinkedList<>();

        System.out.println(nameList.size());//0
        nameList.add("Amit");
        nameList.add("Sumit");
        System.out.println(nameList.size());//1
        System.out.println(nameList);
        System.out.println(nameList.get(0)); // Amit

        Iterator<String> it = nameList.iterator();
        while (it.hasNext()) {
            String names = it.next();
            System.out.println(names);
        }

        LinkedList<String> lang = new LinkedList<>(Arrays.asList("Java", "Python", "C", "Cobol"));
        System.out.println(lang.size());
        //reverse the linkList
        Iterator<String> iterator = lang.descendingIterator();
        while (iterator.hasNext()) {
            String languages = iterator.next();
            System.out.println(languages);
        }

        //For each
        for (String l : lang) {
            System.out.println(l);
        }

        // for loop
        for (int i = 0; i < lang.size(); i++) {
            System.out.println(lang.get(i));
        }

        //Sort:
        Collections.sort(lang);
        System.out.println(lang);


    }
}