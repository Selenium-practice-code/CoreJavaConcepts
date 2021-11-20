package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapConcept {

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
     */

    public static void main(String[] args) {

        HashMap<String, String> capitalMap = new HashMap<String, String>();
        capitalMap.put("India", "New Delhi");
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "London");
        capitalMap.put(null, "Germany");
        capitalMap.put(null, "China");
        capitalMap.put("Russia", null);
        capitalMap.put("France", null);
        capitalMap.remove("France");

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Germany")); // Null
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("Russia"));

        System.out.println("-------------------");
        //Iterator : Over the keys : using keySet()
        Iterator<String> it = capitalMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println("-------------------");
        //Iterator : Over the Set(Pair) : using entrySet()
        Iterator<Map.Entry<String, String>> i = capitalMap.entrySet().iterator();

        while (i.hasNext()) {
            // give me set of entry
            Map.Entry<String, String> entry = i.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("-------------------");
        //Iterator : forEach() using lambda
        capitalMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

    }
}
