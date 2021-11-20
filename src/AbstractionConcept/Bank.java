package AbstractionConcept;

public abstract class Bank {

    int amt = 100;
    final int rate = 10;
    static double interestRate = 6.5;

    /**
     * Partial abstraction
     * Hiding the implementation logic -- is called Abstraction
     * Abstract class have both abstract method and non-abstract method
     * Can not create the object of abstract class
     * Can not create the object of Interface class
     */
    public abstract void loan(); // Abstract Method--no Method body

    // Non-Abstract Methods
    public void debit() {
        System.out.println("Bank..debit...method");
    }

    public void credit() {
        System.out.println("Bank..credit...method");
    }
}
