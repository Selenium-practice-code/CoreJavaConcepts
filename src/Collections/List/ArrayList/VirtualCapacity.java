package Collections.List.ArrayList;

import java.util.ArrayList;

public class VirtualCapacity {

    /**
     * virtual Capacity by defaults is 10
     *
     * @param args
     */

    public static void main(String[] args) {

        ArrayList<Object> ar = new ArrayList<Object>();

        System.out.println(ar.size());
        ar.add(10);
        ar.add(200);
        ar.add(10);
        ar.add(400);
        System.out.println(ar.size());
    }
}
