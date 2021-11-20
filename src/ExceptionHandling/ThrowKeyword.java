package ExceptionHandling;

public class ThrowKeyword {

    /**
     * Throw Vs Thrown keywords
     * 1.Throw keyword used when u want to throw Exception deliberately, it's okay I want to
     * create my own exception, and I want to throw it.
     * some exceptions are not available in Java, so you can create ur own exception like "SumitException"
     * and throw it using Throw keyword.
     * Always handle by Try-Catch block
     */

    public static void main(String[] args) {

        System.out.println("Hi, this is show how throw keyword used");

        try {
            throw new Exception("Exception Thrown");
        } catch (Throwable t) {
            t.printStackTrace();
        }

        System.out.println("Exception Catch");

    }
}
