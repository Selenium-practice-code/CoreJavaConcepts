package JavaBasic;

public class TwoDimensionArray {
    public static void main(String[] args) {

        String x[][] = new String[3][5];

        System.out.println(x.length); // gives to total number of Rows
        System.out.println(x[0].length); // total number of Cols - 5

        //1st Row
        x[0][0] = "A";
        x[0][1] = "B";
        x[0][2] = "C";
        x[0][3] = "D";
        x[0][4] = "E";

        //2st Row
        x[1][0] = "A1";
        x[1][1] = "B1";
        x[1][2] = "C1";
        x[1][3] = "D1";
        x[1][4] = "E1";

        //3st Row
        x[2][0] = "A2";
        x[2][1] = "B2";
        x[2][2] = "C2";
        x[2][3] = "D2";
        x[2][4] = "E2";

        System.out.println(x[1][2]);
        System.out.println(x[2][3]);
        System.out.println(x[0][4]);

        // Print all the value of 2D Array
        // row =  0 col 0 to 4
        // row = 1 col 0 to 4
        // row = 2 col 0 to 4
        for (int row = 0; row < x.length; row++) {

            for (int col = 0; col < x[0].length; col++) { // this loop run 1st
                System.out.println(x[row][col]);
            }
        }


    }
}
