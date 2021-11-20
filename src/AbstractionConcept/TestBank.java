package AbstractionConcept;

public class TestBank {

    public static void main(String[] args) {

        HDFCBank hb = new HDFCBank();
        hb.debit();
        hb.credit();
        hb.loan();
        hb.funds();

        //Dynamic Polymorphism
        // Child class object can be referred by parent Class Abstract class reference variable
        Bank b = new HDFCBank();
        b.loan();
        b.debit();
        b.credit();

    }
}
