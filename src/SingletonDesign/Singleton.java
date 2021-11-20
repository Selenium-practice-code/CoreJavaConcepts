package SingletonDesign;

public class Singleton {

    /**
     * 1.Singleton class is a spacial class that only and only one Object at a time
     * 2.Only single instance of the class at a time
     * How to design Singleton class
     * 1. Make Constructor as private
     * 2. Write a public static method that has return type of object of this singleton class(lazy initiation)
     * Diff between singleton class and normal class
     * Ans:- in normal class we use constructor to create the Object whereas for Singleton class
     * we use getInstance() Method to create the Object.
     */

    private static Singleton singleton_instance = null;
    public String str;

    private Singleton() {
        str = "Hi, I am using Singleton class pattern";
    }

    public static Singleton getInstance() {
        if (singleton_instance == null)
            singleton_instance = new Singleton();
        return singleton_instance;
    }


    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.str = (x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        z.str = (z.str).toLowerCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

    }
}
