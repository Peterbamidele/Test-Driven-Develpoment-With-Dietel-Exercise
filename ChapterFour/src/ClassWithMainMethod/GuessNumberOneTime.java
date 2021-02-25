package ClassWithMainMethod;

import java.util.Scanner;

/***
 * You will write a program that
 * randomly generates an integer between 0 and 100 , inclusive. The program prompts the user
 * to enter a number continuously until the number matches the randomly generated number. For
 * each user input, the program tells the user whether the input is too low or too high, so the user
 * can make the next guess intelligently.***/

public class GuessNumberOneTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 101);
        System.out.println("Enter your Guess Value if The Number From 0 - 100");

        int guess = -1;
        while ( true) {

            System.out.print("Enter Your Guess Number:");
            guess = input.nextInt();

            if (guess == number)
                System.out.println("Yes Your number is : " + number);
            else if (guess > number)
                System.out.println("Your guess number is too high");

            else System.out.println("Your guess Number is too low");
        }
    }
}
