package Collections.Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class HashMapCompare {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(3, "C");
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "D");

        HashMap<Integer, String> map5 = new HashMap<Integer, String>();
        map5.put(3, "C");
        map5.put(1, "A");
        map5.put(2, "B");
        map5.put(3, "A");

        //1. on basis of Key-value : use equals method:
        System.out.println(map1.equals(map2)); // true
        System.out.println(map1.equals(map3)); //false

        //2. Compare HashMaps with same key : using keySet()
        System.out.println(map1.keySet().equals(map2.keySet())); // true
        System.out.println(map1.keySet().equals(map3.keySet())); //true

        //3. Find Out extra key in Hashmap
        HashMap<Integer, String> map4 = new HashMap<Integer, String>();
        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "D");

        // Solution : combine the keys of both the hashmaps : create hashSet
        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
        //Add keySet from map4
        combineKeys.addAll((map4.keySet()));
        combineKeys.removeAll((map1.keySet()));
        System.out.println(combineKeys);

        //1 case : duplicates are not allowed : using arrayList
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values()))); // true
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values()))); // false

        //2 case : duplicates are allowed : hashset
        System.out.println(new HashSet<>(map2.values()).equals(new HashSet<>(map1.values()))); //true
        System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map5.values()))); //true


    }
}
