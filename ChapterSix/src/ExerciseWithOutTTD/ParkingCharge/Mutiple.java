package ExerciseWithOutTTD.ParkingCharge;

import java.util.Scanner;
/****
 * (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
 * second integer is a multiple of the first. The method should take two integer arguments and return
 * true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
 * Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
 * time) and determines whether the second value in each pair is a multiple of the first.*****/

public class Mutiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first value:");
        int firstValue = input.nextInt();
        System.out.printf("Enter the second value:");
        int secondValue = input.nextInt();
        isMutiple(firstValue,secondValue);
    }

    private static void isMutiple(int ValueOne, int ValueTwo) {
        if(ValueOne % ValueTwo == 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        }
    }

