package OverloadMainMethod;

public class TestMain {

    public static void main(String[] args) {

        System.out.println("This is Main Method");
        main(10);
        main("Sumit");
    }

    public static void main(int i) {
        System.out.println(i);
    }

    public static void main(String name){
        System.out.println(name);
    }
}
