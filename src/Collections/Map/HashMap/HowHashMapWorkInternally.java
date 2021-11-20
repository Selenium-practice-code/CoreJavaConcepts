package Collections.Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HowHashMapWorkInternally {

    /**
     * How HashMap works internally
     * What is the changes after JDK1.8
     * Java uses very imp method which is coming from Object class that is called hashCode() method override
     * Hashing : hashCode() -> hashing
     * No order - No indexing
     * Key can not be duplicate
     * value can be duplicate
     * Store n number of null values but only one null key
     * HashMap is not thread-safe - Unsynchronized*
     * HashCode of NullValue is always 0 and index also will be 0
     * if 8 Node having same Index so worst time complexity is O(n) use LinkedList = thrashHold value
     * After JDK 8 after 8 node jdk 8 used balanced Tree O(log n) = Left-hand side store smaller values and right-hand side larger value
     */
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();
        //Node<k,v>
        //Crate int hash
        //K key
        //v Value
        //Node<k,v>next;
        /**
         * Put method works Internally
         * public V put(K key, V value){
         *  int hash = hashCode(key); // hashCode generate on bases of key
         *  int index = hash & (n-1);
         *
         * n = 16(map size)
         *
         */
        marks.put("Rohit", 100); // Key | hashCode | value | null (Connect next Node is available)
        marks.put("Sumit", 80);
        marks.put("Ravi", 200);
        marks.put("Mansi", 300);

        marks.put(null, 500);
        marks.put(null, 600);
        marks.put("Rohit", 900);

        // hashCode() -- hashing --Ravi---216809
        // index = 15
        //.equals to check the key name
        //Ravi
        //return value
        System.out.println(marks.get("Ravi"));


    }
}
