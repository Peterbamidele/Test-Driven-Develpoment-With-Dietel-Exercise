package TrianglePrintingProgram;

import java.util.Scanner;

public class TrianglePrintingProgramUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Tringle");
        int row = input.nextInt();

        for (int i= 1; i <=row; i++) {
            for (int column = 1; column <=i; column++) {
                System.out.print("* ");
            }
            System.out.println("");
            
        }

        System.out.println();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input2.nextInt();

        for (int i = rows; i >=1 ; i--) {
            for (int colunms = 1; colunms <= rows ; colunms++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        
    }
}
