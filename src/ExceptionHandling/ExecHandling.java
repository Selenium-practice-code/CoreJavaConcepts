package ExceptionHandling;

public class ExecHandling {

    int a = 20;

    public static void main(String[] args) throws InterruptedException {


        //  int i = 9/0;
        //   System.out.println(i); // .ArithmeticException ..Checked Exception
        // Thread.sleep(2000); // Checked Exception
        /*
        ExecHandling obj = null; // Null reference
        ExecHandling obj1 = new ExecHandling();
        obj1 = null; // Means Cancelling ref
        System.out.println(obj); // Null
        System.out.println(obj1); // Null
        System.out.println(obj.a); // NullPointer Exception "declare Object ref to null"*/

        // 1. Try-Catch block :- useful for catching exception and report exception..
        try {
            int i = 9 / 0; // This code will throw a exception
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("We Catch the Exception");

        }

        System.out.println("We are handling Exception");
    }
}
