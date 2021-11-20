package Collections.HashTable;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Naveen", 100);
        ht.put("Rohit", 200);
        ht.put("Sumit", 300);
        ht.put("Mansi", 400);
        ht.put("Naveen", 500);

        System.out.println(ht.get("Naveen"));

    }
}
