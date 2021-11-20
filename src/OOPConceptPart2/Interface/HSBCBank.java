package OOPConceptPart2.Interface;

public class HSBCBank extends GlobalBankData implements USBank, BrazilBank {

    //IS-A Relationship

    // if a class implementing any interface, then It's mandatory to define all the override method of Interface
    // USBank Override Method
    @Override
    public void credit() {
        System.out.println("HSBC..Credit");
    }

    @Override
    public void debit() {
        System.out.println("HSBC..Debit");
    }

    @Override
    public void transferMoney() {
        System.out.println("HSBC..transferMoney");

    }

    @Override
    public void UPIPayment() {
        System.out.println("USBankUPI..UPIMethod");
    }

    public void educationLoan() {
        System.out.println("HSBC...educationLoan");
    }

    public void carLoan() {
        System.out.println("HSBC...carLoan");
    }


    // BrazilBank Override Method
    @Override
    public void mutualFund() {
        System.out.println("HSBC.....mutualFund");
    }

    //MonitorBank
    @Override
    public void monitorBankFrauds() {
        System.out.println("Monitor all Bank frauds in Banks");
    }
}
