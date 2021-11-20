package JavaBasic;

public class LoopsConcept {

    public static void main(String[] args) {

        // 1. While loop
        // Disadvantage : it gives infinite loop if you don't give incremental/decrement part
        int i = 1;

        while (i <= 10) {

            System.out.println(i);
            i = i + 1;

        }


        System.out.println("***********************");

        //2. For Loop
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        System.out.println("***********************");
        //Print 10 to 1
        //10...1
        for (int k = 10; k >= 1; k--) {
            System.out.println(k);
        }
    }

}
