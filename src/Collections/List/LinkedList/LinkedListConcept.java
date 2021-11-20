package Collections.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Test");
        ll.add("Selenium");
        ll.add("Java");
        ll.add("M1Air");

        System.out.println("Values of Linked List is : " + ll);
        System.out.println("------------------------");
        //addFirst
        ll.addFirst("Welcome");
        //addLast
        ll.addLast("Closed");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println("------------------------");
        //Set
        ll.set(0, "WelcomeLink");
        System.out.println(ll.get(0));

        System.out.println("------------------------");
        // Remove First and Last
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Content of linkedlist " + ll);

        System.out.println("------------------------");
        // Remove bases of index
        ll.remove(2);
        System.out.println("Content of Linkedlist" + ll);

        System.out.println("------------------------");
        // how get all values using Loops
        System.out.println("using for loop...");
        for (int n = 0; n < ll.size(); n++) {
            System.out.println(ll.get(n));
        }

        System.out.println("using Advanced for loop...");
        for (String str : ll) {
            System.out.println(str);

        }

        System.out.println("using iterate...");
        Iterator<String> it2 = ll.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("Using while loop..");
        int num = 0;
        while (ll.size() > num) {
            System.out.println(ll.get(num));
            num++;
        }


    }
}
