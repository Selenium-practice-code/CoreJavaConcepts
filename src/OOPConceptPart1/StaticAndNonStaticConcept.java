package OOPConceptPart1;

public class StaticAndNonStaticConcept {

    String name = "tom"; // non-satatic global variable
    static int age = 25; // static global variable

    public static void main(String[] args) {
        // how call static method and var?
        // 1. directly calling
        sum();

        //2. calling by class name
        StaticAndNonStaticConcept.sum();

        System.out.println(age);
        System.out.println(StaticAndNonStaticConcept.age);

        // Hpw to call non-static method and var
        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.send();
        System.out.println(obj.name);

        // can i access static method by using object reference
        obj.sum(); // not good practice


    }

    public void send() {
        System.out.println("send method");
    }

    public static void sum() {
        System.out.println("sum method");
    }
}
