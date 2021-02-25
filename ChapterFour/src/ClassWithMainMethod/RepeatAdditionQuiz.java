package ClassWithMainMethod;

import java.util.Scanner;

/***
 * A program that prompts the user to enter
 * an answer for a question on addition of two single digits. Using a loop, you can now rewrite
 * the program to let the user repeatedly enter a new answer until it is correct,***/

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int firstQuestion = (int)(Math.random()* 30);
        int secondQuestion = (int)(Math.random()* 30);

        Scanner input = new Scanner(System.in);


        System.out.print("What is " + firstQuestion + " + " + secondQuestion + " = ? " );
        int answer = input.nextInt();

        while (firstQuestion + secondQuestion != answer){
            System.out.println("Wrong Answer. Try Again. What is " + firstQuestion + " + " + secondQuestion + "? \n");
            answer= input.nextInt();
        }
        System.out.println("You got it!");
    }
}
