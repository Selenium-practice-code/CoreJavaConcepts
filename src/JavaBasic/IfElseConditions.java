package JavaBasic;

public class IfElseConditions {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (b > a) {
            System.out.println("b is greater than a");

        } else {
            System.out.println("a is greater than b");
        }

        // Comparison operators -: <> >= <= !=
        int i = 20;
        int j = 205;

        if (i == j) {
            System.out.println("i is equal to j");
        } else {
            System.out.println("i and j not equal");
        }

        // Find the largest number
        int a1 = 950;
        int b1 = 1000;
        int c1 = 900;

        if (a1 > b1 && a1 > c1) {
            System.out.println("a1 is largest");
        } else if (b1 > c1) {
            System.out.println("b1 is largest");
        } else {
            System.out.println("c1 is largest");
        }

    }

}
