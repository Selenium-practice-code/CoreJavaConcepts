package ConstructorWithThisAndSuper;

public class ConstructorWithThisKeyword {

    String name;
    int age;

    public ConstructorWithThisKeyword(String name, int age) {
        this.name = name; // Initialize the Global/class variable with the current value of constructor using This keyword
        this.age = age;

        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {

        ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 28);

    }
}
