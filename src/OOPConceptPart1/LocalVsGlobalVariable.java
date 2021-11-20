package OOPConceptPart1;

public class LocalVsGlobalVariable {

    // Global variable/class variable -- use throughout ur program
    String name = "Ravi";
    int age = 25;

    public static void main(String[] args) {

        int i = 23; // local variable ony in main method
        System.out.println(i);

        LocalVsGlobalVariable lg = new LocalVsGlobalVariable();
        System.out.println(lg.name);
        System.out.println(lg.age);

        lg.sum();

    }

    public void sum() {
        int i = 20; // local variable only in sum method
        int j = 30;
        System.out.println(i);
    }
}
