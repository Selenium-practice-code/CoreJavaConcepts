package ExceptionHandling;

public class TestMyException {

    public static void main(String[] args) {

        int x = 5, y = 1000;

        float z = (float) x / (float) y;

        if (z < 0.01) {
            try {
                throw new MyException("Number is too Small");

            } catch (MyException e) {
                System.out.println("Caught my Exception");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("I am always here");
            }
        }
    }
}