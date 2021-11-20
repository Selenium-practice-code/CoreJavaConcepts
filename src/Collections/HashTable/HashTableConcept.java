package Collections.HashTable;

import java.util.Hashtable;

/**
 * HashTable is synchronized
 * It does not allow any null key and null value
 * initial capacity of HT = 11, Load factor = 0.75
 */

public class HashTableConcept {

    public static void main(String[] args) {

        Hashtable h = new Hashtable();
        h.put("A", "Test");
        h.put("B", 123);
        h.put("C", 'A');
        h.put(1, "Welcome");

        System.out.println(h.size());
        System.out.println(h.get("A"));

        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        ht.put(2, 12);
        ht.put(3, 10);
        System.out.println(ht.get(2));

        Hashtable<Integer, String> t = new Hashtable<Integer, String>();
        t.put(4, "Tom");
        System.out.println(t.get(4));
    }
}
