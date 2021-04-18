package ExerciseWithOutTTD.ParkingCharge;

import java.util.Scanner;

public class DisplayingaSquareofAnyCharacter {
    /****
     * 6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to re-
     * ceive a second parameter of type char called fillCharacter . Form the square using the char pro-
     * vided as an argument. Thus, if side is 5 and fillCharacter is # , the method should display
     * #####
     * #####
     * #####
     * #####
     * #####
     * Use the following statement (in which input is a Scanner object) to read a character from the user
     * at the keyboard:
     * char fill = input.next().charAt(0);****/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character you would like to print:");
        char character= input.next().charAt(0);
        System.out.println("Enter the number of Time you want to print:");
        int number = input.nextInt();
        int count= number;
        while (count>0) {
            for (int counter = 0; counter <number ; counter++) {
                System.out.printf("#", character);
            }
            System.out.println();
            count--;
        }
        }


    }

