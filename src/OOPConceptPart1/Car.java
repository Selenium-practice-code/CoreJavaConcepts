package OOPConceptPart1;

public class Car {

    //Class Variable
    int mod;
    int wheel;

    public static void main(String[] args) {

        // new Car(); -- this is the object of car class
        // new Keyword is used to create a Object
        // a,b,c object reference variable
        Car c = new Car();
        Car a = new Car();
        Car b = new Car();

        a.mod = 2016;
        a.wheel = 4;

        b.mod = 2015;
        b.wheel = 4;

        c.mod = 2018;
        c.wheel = 4;

        System.out.println(a.mod);
        System.out.println(b.mod);
        System.out.println(a.wheel);
        System.out.println(b.wheel);
        System.out.println(c.mod);
        System.out.println(c.wheel);

        System.out.println("After Shifting the References");

        a = b;
        b = c;
        c = a;

        a.mod = 10;
        System.out.println(a.mod); // 10
        c.mod = 20;
        System.out.println(a.mod); // 20
        System.out.println(c.mod); //20
    }
}
