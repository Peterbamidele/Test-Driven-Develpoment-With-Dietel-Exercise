package ClassWithMainMethod;

import java.util.Scanner;
/***
 * (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
 * the two largest values of the 10 values entered. [Note: You may input each number only once.]***/

public class FindtheTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;
        int Secondlargest = 0;
        int counter = 1;



        while (counter <= 10){
            System.out.printf("Enter Two Number%d:%n",counter);
            int number = input.nextInt();

            if (number >largest ){
                 largest = number;
            }
            else if ( number > Secondlargest){
                Secondlargest = number;
            }
            counter++;
        }
        System.out.printf("The largest is %d%nAnd the second largest is %d%n",largest,Secondlargest);


    }
}
