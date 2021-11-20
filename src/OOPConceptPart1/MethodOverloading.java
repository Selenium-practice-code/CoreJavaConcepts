package OOPConceptPart1;

public class MethodOverloading {

    // same method name with diff parameter/arguments with diff data type with in a same class is called method overloading
    // u can not create method inside the methods
    // duplicate method : same method name with same number of arguments are not allowed
    // main method can be overload

    public static void main(String[] args) {

        MethodOverloading ml = new MethodOverloading();
        ml.sum();
        ml.sum(10);
        ml.sum(10, 20);


    }

    public void sum() {
        System.out.println("sum method ...zero parameter");
    }

    public void sum(int i) {
        System.out.println("sum method with 1 input parameter: " + i);
    }

    public void sum(int k, int y) {
        System.out.println("sum method with 2 input parameter: " + (k + y));
    }

}
