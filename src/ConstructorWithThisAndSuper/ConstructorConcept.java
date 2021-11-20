package ConstructorWithThisAndSuper;

public class ConstructorConcept {
    /**
     * Class entity which is used to define some class features while
     * creating a object in from of global variable
     * it not returns any value
     * constructor name same as class name
     * while creating the class default constructor is always there(hidden)
     */

    public ConstructorConcept() {
        System.out.println("Default Constructor");
    }

    public ConstructorConcept(int i) {
        System.out.println("Params constructor");
        System.out.println("Value os i is :" + i);
    }


    public static void main(String[] args) {

        ConstructorConcept obj = new ConstructorConcept();

    }
}
