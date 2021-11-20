package OOPConceptPart2.Interface;

public class TestBank {

    public static void main(String[] args) {

        System.out.println("Min Balance is :- " + USBank.minBal);

        HSBCBank hb = new HSBCBank();
        hb.credit();
        hb.debit();
        hb.transferMoney();
        hb.educationLoan();
        hb.carLoan();
        hb.internshipJobInBank();
        hb.UPIPayment();
        hb.monitorBankFrauds();
        hb.customerHistory();

        USBank.addMoney();
        BrazilBank.emergencyCalling();

        //Dynamic Polymorphism
        // Child class object can be referred by parent Interface reference variable
        //Only Overridden Method call and default method
        USBank ub = new HSBCBank();
        ub.credit();
        ub.debit();
        ub.transferMoney();
        ub.internshipJobInBank();
        ub.monitorBankFrauds();

    }
}
