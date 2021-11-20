package Collections.Map.HashMap;


import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

    public static Map<String, Integer> marksMap;

    static {

        marksMap = new HashMap<>();
        marksMap.put("A", 100);
    }

    public static void main(String[] args) {

        //1. Using HashMap Class
        HashMap<String, String> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>(); //Top casting also called Dynamic Polymorphism

        //2. Static way : Static HashMap:
        System.out.println(HashMapInitialization.marksMap.get("A"));

        // 3. immutable Map with only single entry using Collections Class
        Map<String, Integer> map2 = Collections.singletonMap("B", 200);
        System.out.println(map2.get("B"));
        //  map2.put("c", 300); --> UnsupportedOperationException

        //4. JDK 8: Create 2 dimension array and convert into form map using streams
        Map<String, String> map3 = Stream.of(new String[][]{

//                {"Tom", "A Grade"},
//                {"Sita", "B Grade"}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        System.out.println(map3.get("Tom"));
        map3.put("Lisa", "A++ Grade");
        map3.put("Tom", "A Grade");

        System.out.println(map3.get("Lisa"));
        System.out.println(map3.get("Tom"));

        //5. Using Simple Entry : mutable map
        Map<String, String> map4 = Stream.of(
                // create a object of abstract map class
                new AbstractMap.SimpleEntry<>("Sumit", "Java"),
                new AbstractMap.SimpleEntry<>("Mansi", "Python")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map4.get("Sumit"));

        //jdk 1.9
        //empty map
        Map<String, String> emptyMap = Map.of();
//        emptyMap.put("Mansi", "Python"); --> UnsupportedOperationException

        Map<String, String> singletonMap = Map.of("k1", "V1");
        System.out.println(singletonMap.get("k1"));




    }
}
