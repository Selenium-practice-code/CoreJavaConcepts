package ConstructorWithThisAndSuper.SuperKeyword;

public class ChildClass extends ParentClass {

    // Super keyword to used call parent class Constructor

    public ChildClass() {
        super(10); // explicitly call the Constructor with the help of Super Keyword , should be first statement
        System.out.println("Child Const");
    }

    public static void main(String[] args) {

        ChildClass cc = new ChildClass();
    }
}
