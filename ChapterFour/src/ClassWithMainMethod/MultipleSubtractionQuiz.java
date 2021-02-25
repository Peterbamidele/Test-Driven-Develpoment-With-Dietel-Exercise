package ClassWithMainMethod;

import java.util.Scanner;

/***
 * a program that generates five questions and, after a student answers all
 * five, reports the number of correct answers. The program also displays the time spent on the
 * test and lists all the questions.****/
public class MultipleSubtractionQuiz {
    public static void main(String[] args) {
        final int NumberOfQuestions = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";


        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        while (count < NumberOfQuestions) {
            number1 = (int) (Math.random() * 10);
            number2 = (int) (Math.random() * 10);


            // Swapping number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            //Prompt the student to answer "What is number1 - number 2?"

            System.out.print("What is " + number1 + " _ "  +  number2   +  " ? ");
            int answer = input.nextInt();

            // Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++; // Increase the corect answer count
            } else System.out.println("Your answer is wrong.\n" + number1 +
                    "-" + number2 + " should be " + (number1 - number2));

            // Increase the question
            count++;
            output += "\n" +  number1  + " _ " + number2 + " - " +  answer  +
                    ((number1 - number2 == answer) ? "correct" : "wrong");

        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println(" Correct count is " + correctCount + "\nTest time is " +  testTime / 1000
        + " second \n" + output);
    }
}
