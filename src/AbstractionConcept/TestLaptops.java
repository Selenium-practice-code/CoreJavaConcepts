package AbstractionConcept;

public class TestLaptops {

    public static void main(String[] args) {

        NoteBooks nb = new NoteBooks();
        nb.apple();
        nb.asus();
        nb.lenovo();
        nb.virusSafety();

        //Dynamic Polymorphism
        // Child class object can be referred by parent Class Interface reference variable
        // Notebooks class not allow accessing Laptop reference variable
        Laptops l = new NoteBooks();
        l.apple();
        l.asus();
        l.lenovo();
    }
}
