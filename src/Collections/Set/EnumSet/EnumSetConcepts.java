package Collections.Set.EnumSet;

import OverloadMainMethod.B;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

    /**
     * EnumSet is not synchronized
     * Faster than HashSet
     * All the methods are implemented using bitwise arithmetic operations
     */

    //Create a Enum for Browsers
    enum Browsers {
        SAFARI,
        IE,
        CHROME,
        OPERA
    }

    public static void main(String[] args) {

        EnumSet<Browsers> browsers = EnumSet.allOf(Browsers.class);
        System.out.println(browsers); //[SAFARI, IE, CHROME, OPERA]

        //empty enum set
        EnumSet<Browsers> browsers1 = EnumSet.noneOf(Browsers.class);
        System.out.println(browsers1);//[] empty enum set

        //range(e1,e2)
        EnumSet<Browsers> browsers2 = EnumSet.range(Browsers.SAFARI, Browsers.CHROME);
        System.out.println(browsers2);//[SAFARI, IE, CHROME]

//        EnumSet<Browsers> browsers3 = EnumSet.range(Browsers.CHROME, Browsers.SAFARI);
//        System.out.println(browsers3);// gives IllegalArgumentException

        EnumSet<Browsers> ieEnum = EnumSet.of(Browsers.IE);
        System.out.println(ieEnum);//[IE]

        //add and addAll()
        EnumSet<Browsers> browsers3 = EnumSet.allOf(Browsers.class);
        EnumSet<Browsers> browsers4 = EnumSet.noneOf(Browsers.class);

        browsers4.add(Browsers.OPERA);
        browsers4.addAll(browsers3);

        System.out.println(browsers4);

        //iterate Enum
        EnumSet<Browsers> allEnumSet = EnumSet.allOf(Browsers.class);

        Iterator<Browsers> iterator = allEnumSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.println(" , ");
        }

        //remove specific and remove all
        EnumSet<Browsers> newEnumSet = EnumSet.allOf(Browsers.class);
        System.out.println(newEnumSet);

        boolean b = newEnumSet.remove(Browsers.CHROME);
        System.out.println(b); //True
        System.out.println(newEnumSet);//[SAFARI, IE, OPERA]

        boolean c = newEnumSet.removeAll(newEnumSet);
        System.out.println(c);
        System.out.println(newEnumSet);//[]

    }
}
