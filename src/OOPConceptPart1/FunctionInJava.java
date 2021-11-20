package OOPConceptPart1;

public class FunctionInJava {

    // main method -- starting point of execution
    public static void main(String[] args) {

        // One object will be created, fj is a reference variable, referring to this object
        FunctionInJava fj = new FunctionInJava(); // new Object created
        //after creating the object, the copy of non-static methods will be given to this object
        fj.test();

        String s1 = fj.abc();
        System.out.println(s1);

        int l = fj.xyz();
        System.out.println(l);

        int k = fj.division(20, 10);
        System.out.println(k);

    }

    // non-static methods/function
    // void -- does not return anything
    // Return type = void
    public void test() {
        System.out.println("test Method");
    }

    // Return type = int
    public int xyz() {
        System.out.println("xyz Method");
        int a = 10;
        int b = 20;
        int c = a + b;

        return c;
    }

    // Return type = String
    public String abc() {
        System.out.println("abc Method");
        String s = "Selenium";

        return s;
    }

    // x,y -> input parameters/arguments
    // Return type = int
    public int division(int x, int y) {
        System.out.println("division Method");

        int d = x / y;

        return d;

    }
}
