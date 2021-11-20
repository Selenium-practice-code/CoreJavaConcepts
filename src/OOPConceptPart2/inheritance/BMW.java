package OOPConceptPart2.inheritance;

public class BMW extends Car { // has-a relationship

    // Method-overriding :- When same method in parent class as well as child class
    // with the same name and same number of arguments

    @Override
    public void start() {
        System.out.println("BMW.....start");
    }

    public void theftSafe() {
        System.out.println("BMW....theftSafety");
    }
}
