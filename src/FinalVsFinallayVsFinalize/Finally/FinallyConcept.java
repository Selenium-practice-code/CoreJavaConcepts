package FinalVsFinallayVsFinalize.Finally;

public class FinallyConcept {

    // Finally, keyword used with try catch block
    // it doest matter there is any exception or not finally block always executed

    public static void main(String[] args) {

        //  test1();
        // test2();
        //division();
        division1();
    }

    public static void test1() {

        try {
            System.out.println("inside test1 method");
            throw new RuntimeException("test");
        } catch (Exception e) {
            System.out.println("inside catch block");
        } finally {
            System.out.println("inside finally block");
        }

    }

    public static void test2() {
        try {
            System.out.println("Inside test2 method");
        } finally {
            System.out.println("inside Finally");
        }
    }

    public static void division() {
        int i = 10;
        try {
            System.out.println("Inside Try block");
            int k = i / 0;
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block");
            System.out.println("value divide by zero error");
        } finally {
            System.out.println("execute this code even after exception");
        }

    }

    public static void division1() {
        int j = 20;
        try {
            System.out.println("inside the try block");
            int w = j / 0;
        } catch (NullPointerException e) {
            System.out.println("Inside catch block");
            System.out.println("value divide by zero error");
        } finally {
            System.out.println("execute this code even after exception");
        }

    }
}
