package AbstractionConcept;

public class NoteBooks implements Laptops {
    @Override
    public void lenovo() {
        System.out.println("LenovoG570 is a NoteBook");
    }

    @Override
    public void apple() {
        System.out.println("MacbookAir is a NoteBook");
    }

    @Override
    public void asus() {
        System.out.println("Asus is a NoteBook");
    }

    public void virusSafety() {
        System.out.println("Protect form virus..");

    }
}
