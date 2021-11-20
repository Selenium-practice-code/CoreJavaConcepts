package OOPConceptPart2.inheritance;

public class TestCar {

    public static void main(String[] args) {


        //static polymorphism or compile-time polymorphism
        BMW b = new BMW();
        b.start(); // preference given to child class method if same method name is used in parent and child class
        b.stop();
        b.refuel();
        b.theftSafe();
        b.engine();

        System.out.println("*****************");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        c.engine();

        System.out.println("*****************");

        //Top Casting
        Car c1 = new BMW(); // child class object can be referred by
        // parent class reference variable -- dynamic polymorphism--runtime polymorphism
        c1.start();
        c1.stop();
        c1.refuel();

        Vechile v1 = new BMW();
        v1.engine();

        // Down Casting
        BMW b1 = (BMW) new Car(); // At run type it give you ClassCastException





    }
}
