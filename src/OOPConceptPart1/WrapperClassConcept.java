package OOPConceptPart1;

public class WrapperClassConcept {

    public static void main(String[] args) {

        String x = "100";
        System.out.println(x + 20); //10020

        // data conversion String to int
        int i = Integer.parseInt(x);
        System.out.println(i + 20); //120

        // String to double
        String s = "12.33";
        double d = Double.parseDouble(s);
        System.out.println(d + 10);

        // String to boolean
        String x1 = "true";
        boolean b = Boolean.parseBoolean(x1);
        System.out.println(b);

        // int to string
        int j = 20;
        System.out.println(j + 20);
        String s1 = String.valueOf(j);
        System.out.println(s1 + 20);

        String u = "100A";
        Integer.parseInt(u); // Gives you NumberFormatException -- For input string: "100A"

    }
}
