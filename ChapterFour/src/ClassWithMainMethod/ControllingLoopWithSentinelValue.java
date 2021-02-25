package ClassWithMainMethod;

import java.util.Scanner;

/***
 * a program that reads and calculates the sum of an unspecified number
 * of integers.
 * The input 0 signifies the end of the input***/

public class ControllingLoopWithSentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
         //int data;
         int sum = 0;

        System.out.print("Enter an integer(the input ends if is 0):");
        int data = input.nextInt();

         while (data != 0) {
             sum += data;

             System.out.print("Enter an integer(the input ends if is 0):");
             data = input.nextInt();
         }
        System.out.println("The sum is " + sum);

    }
}
