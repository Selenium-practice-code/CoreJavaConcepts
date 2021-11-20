package Collections.Map.HashMap;

import java.util.*;

public class ConvertHashMapToArrayList {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Hi");
        map.put(3, "Hey");

        Iterator<Map.Entry<Integer, String>> i = map.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<Integer, String> pairs = i.next();
            System.out.println("Key: " + pairs.getKey() + ", Value: " + pairs.getValue());
        }

        //Convert HashMap keys into ArrayList
        List<Integer> keyList = new ArrayList<>(map.keySet());

        for (Integer l : keyList) {
            System.out.println(l);
        }

        //Convert HashMap Value into ArrayList
        List<String> valueList = new ArrayList<>(map.values());
        System.out.println(valueList);

        for (String v : valueList) {
            System.out.println(v);
        }

    }
}
