package ExceptionHandling;

public class ThrowsKeyword {

    /**
     * Throws keyword also used for handling the exception
     * In throws keyword we don't report anything
     * Throws keyword always used when we have method chaining(means 100 methods throw exception then use Throws)
     * Sum method catch the exception because sum() calling div() method
     * sum method responsibility to catch this exception and sum method will also throw this exception to whom to main
     * Method why because mein() method calling sum() method, Ultimately nobody catching it everyone is just getting it
     * throwing it that Exception
     * This Exception taking Care by JVM, whenever u execute ur program JVM call mein() method JVM see oh main method
     * Throwing an exception so that exception caught by JVM, JVM gives complete Exception hierarchy
     */
    public static void main(String[] args) {

        sum();
        System.out.println("Trying the handle exception");
    }

    public static void sum() {
        try {
            div();
        } catch (Throwable t) { //Throwable is a superclass so any error and exception is coming its handle by Throwable

        }
    }

    public static void div() throws ArithmeticException {
        int i = 9 / 0; // Exception line...
    }
}
