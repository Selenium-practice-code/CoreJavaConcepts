package OOPConceptPart1;

public class CallByValueAndCallByReference {

    int p;
    int q;

    public static void main(String[] args) {

        CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
        int x = 10;
        int y = 20;
        obj.testSum(x, y); // Call by Value(Copy of x and y giving to a and b)

        obj.p = 30;
        obj.q = 40;

        obj.swap(obj); // passing object reference
        System.out.println("value of p after swapping is : " + obj.p);
        System.out.println("value of q after swapping is : " + obj.q);

    }

    public int testSum(int a, int b) {
        int c = a + b;
        return c;
    }

    // Call by reference
    public void swap(CallByValueAndCallByReference t) {  // Pass the reference variable of this particular class
        int temp;
        temp = t.p; // temp - 30
        t.p = t.q; // t.p - 20
        t.q = temp; // t.q - 30

    }


}
