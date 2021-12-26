package JavaBasic;

public class IncrementAndDecrementOperators {

    public static void main(String[] args) {

        int i = 1;
        int j = i++; // post increment:- means first give the value of i to j then increment the value of i

        System.out.println(i); // 2
        System.out.println(j); // 1

        int a = 2;
        int b = ++a; // pre increment:- means increase the value of a by +1 then give to b

        System.out.println(a); //3
        System.out.println(b); //3

        int m = 2;
        int n = m--; // post decrement :- means first give the value of m to n then decrease the value

        System.out.println(m); //1
        System.out.println(n); //2

        int c = 2;
        int d = --c; // pre decrement :- means decrease the value of c by -1 then give to d

        System.out.println(c); //1
        System.out.println(d); // 1
    }
}
