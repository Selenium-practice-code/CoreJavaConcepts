package FinalVsFinallayVsFinalize.Finalize;

public class FinalizeConcept {

    // Using for garbage Collection
    // if No object reference variable available
    // Finalize Method used for clean up processing before garbage collector processing

    public void finalize() {
        System.out.println("inside finalize method ");
    }

    public static void main(String[] args) {

        FinalizeConcept fc = new FinalizeConcept();
        FinalizeConcept fc1 = new FinalizeConcept();

        fc = null;
        fc1 = null;

        System.gc();

    }
}
