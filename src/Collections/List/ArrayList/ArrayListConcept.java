package Collections.List.ArrayList;

import Collections.List.ArrayList.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String[] args) {

        // Array List Growable in Nature
        // Add homogeneous as well as heterogeneous data
        // Store value in a form Indexes
        // Duplicate value allowed
        // Maintains Insertion order
        // Allow u random access because values store in form of indexes

        ArrayList al = new ArrayList();
        al.add("123"); //0
        al.add(200); // 1
        al.add(true); // 2
        al.add('A'); // 3
        al.add("Mac"); //4

        System.out.println(al.size());
        System.out.println(al.get(4));
        System.out.println("Lower Index " + 0);
        System.out.println("Higher Index " + (al.size() - 1));

        // Print all the values in arrayList Using For Loop
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println("__________________");
        // Print all the values in ArrayList using iterator
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("__________________");
        // Print all the values in ArrayList using Streams with lambda
        al.stream().forEach(ele -> System.out.println(ele));


        System.out.println("__________________");
        ArrayList<Integer> la = new ArrayList<Integer>();
        la.add(100);

        System.out.println("__________________");
        ArrayList<String> s = new ArrayList<String>();
        s.add("MacbookAir-M1");
        System.out.println(s.get(0));

        System.out.println("__________________");
        // Employee class Object
        Employee e = new Employee("Sumit", 30, "IT");
        Employee e1 = new Employee("Tom", 23, "QA");
        Employee e2 = new Employee("Ravi", 30, "DevOps");

        ArrayList<Employee> al1 = new ArrayList<Employee>(); //Store Employee Object
        al1.add(e);
        al1.add(e1);
        al1.add(e2);

        // Use iterate to traverse the value
        Iterator<Employee> it1 = al1.iterator();
        while (it1.hasNext()) {
            Employee emp = it1.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

        System.out.println("__________________");
        //List with other Collection
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));

        System.out.println(numbers);


    }
}
