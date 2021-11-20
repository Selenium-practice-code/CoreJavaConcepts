package Collections.List.ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        //1.Collections.synchronizedList
        //Create a SynchronizedArrayList
        //add, remove -> we don't need explicit synchronization
        //To fetch the value form the list, we have to use explicit synchronization
        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
        nameList.add("Java");
        nameList.add("Ruby");
        nameList.add("Python");

        synchronized (nameList) {
            Iterator<String> i = nameList.iterator(); // Must be in synchronized block
            while (i.hasNext())
                System.out.println((i.next()));
        }

        System.out.println("----------------------");
        //2. CopyOnWriteArrayList -- it's a class
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Sumit");
        empList.add("Rohit");
        empList.add("Ravi");


        Iterator<String> it = empList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }


}
