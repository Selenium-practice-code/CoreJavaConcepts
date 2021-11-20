package JavaBasic;

public class ArrayConcept {

    public static void main(String[] args) {


        // array : to store similar data type values in an array variables
        // int array
        // lower bound/index = 0
        // upper bound/index = n-1(size of array)
        // disadvantage - 1. Size is Fixed -- also called Static Array ---overcome this problem use Collections -- ArrayList, Hashtable(dynamic array)
        // 2. store only similar data types -- to overcome this problem, we use Object array.

        int[] i = new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[1]);
        System.out.println(i[3]);

        // Check the length of array
        System.out.println(i.length);

        // Print all the value of array Use For loop
        for (int value : i) {
            System.out.println(value);
        }

        // System.out.println(i[4]); // it gives ArrayIndexOutOfBoundsException because size of array is 4


        // Object Array -- it is used to store diff data types
        Object ob[] = new Object[4];
        ob[0] = "tom";
        ob[1] = 'A';
        ob[2] = 23;
        ob[3] = 1.2;

        System.out.println(ob[1]);
        System.out.println(ob.length);

        for (int k = 0; k < ob.length; k++) {
            System.out.println(ob[k]);
        }
    }

}
