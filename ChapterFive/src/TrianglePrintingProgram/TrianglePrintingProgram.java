package TrianglePrintingProgram;
/******
 * (Triangle Printing Program) Write an application that displays the following patterns sep-
 * arately, one below the other. Use for loops to generate the patterns. All asterisks ( * ) should be print-
 * ed by a single statement of the form System.out.print('*' ) ; which causes the asterisks to print side
 * by side. A statement of the form System.out.println(); can be used to move to the next line. A
 * statement of the form System.out.print(' ' ) ; can be used to display a space for the last two pat-
 * terns. There should be no other output statements in the program. [Hint: The last two patterns re-
 * quire that each line begin with an appropriate number of blank spaces.]********/


public class TrianglePrintingProgram {
    public static void main(String[] args) {

        int row;
        int column;

        System.out.println();


        for ( row = 1; row <=10; row++)
        {
            for ( column = 1; column <=row; column++)
                System.out.print( "*");

                System.out.println();

               }
        System.out.println();

        for (int row1 = 10; row1 >= 1; row1--) {
            for (int colunm = 1; colunm <= row1 ; colunm++)
                System.out.print("*");

                System.out.println();
        }
        System.out.println();

        for (int row3 = 10; row3 >= 0; row3--) {
            for (int column3 = 0; column3 > row3 ; column3++) {
                System.out.print("*");
            }
            System.out.println("\n");
            
        }

    }
}
