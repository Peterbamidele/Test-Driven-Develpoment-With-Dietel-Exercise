package ExerciseWithOutTTD.ParkingCharge;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
/****
 * 6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
 * square (the same number of rows and columns) of asterisks whose side is specified in integer param-
 * eter side . For example, if side is 4 , the method should display
 * ****
 * ****
 * ****
 * ****
 * Incorporate this method into an application that reads an integer value for side from the user and
 * outputs the asterisks with the squareOfAsterisks method.****/
public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Square you Want to print:");
        int number = input.nextInt();
        int count = number;
        while (count>0){
            for (int counter = 0; counter <number ; counter++) {
                System.out.print("*");

            }
            System.out.println();
            count--;
        }
    }
}
