package OOPConceptPart2.Interface;

public interface USBank extends MonitorBank {

    int minBal = 100;

    public void credit();

    public void debit();

    public void transferMoney();

    public void UPIPayment();

    /**
     * only method declaration
     * no method body - only method prototype
     * in Interface we can declare the variables, variables by default static in Nature.
     * variable value will not be changed Final in Nature
     * no static method in Interface before JDK 1.8
     * no main method in Interface
     * Interface is abstract in nature
     * Can not create object of Interface
     */

    // From JDK1.8, you can have static method in Interface but with method body
    //Static Method cannot Override
    //Static method call using InterfaceName.MethodName
    public static void addMoney() {
        System.out.println("USBank..Please..AddMoney");
    }

    default void internshipJobInBank() {
        System.out.println("you can do Internship Job in any Bank");
    }


}
