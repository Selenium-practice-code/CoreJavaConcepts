package Collections.Map.HashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HashMapSync {

    public static void main(String[] args) {

        //1.Synchronized version in Map
        Map<String, String> map = new HashMap<>();
        map.put("S", "Sumit");
        map.put("M", "Mansi");
        map.put("N", "Neetu");

        // Create Synchronized map
        Map<String, String> synchronizedMapMap = Collections.synchronizedMap(map);
        System.out.println(synchronizedMapMap);

        synchronized (synchronizedMapMap) {
            Iterator<String> i = synchronizedMapMap.keySet().iterator();
            while (i.hasNext()) {
                String key = i.next();
                String value = synchronizedMapMap.get(key);
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }

        //2. ConcurrentHashMap:
        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "India");
        concurrentMap.put(2, "Pakistan");
        concurrentMap.put(3, "China");

        System.out.println(concurrentMap.get(1));

        concurrentMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));


    }
}
