package WithMainMethod;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Smallest = 0;
        int number;
        int intergers;

        System.out.print("Enter value of numbers:");
         intergers = input.nextInt();

        for (int counter =1; counter <= intergers; counter++ ){
            System.out.println("Enter value of integers");
            number = input.nextInt();

            if (counter == 1)
                Smallest = number;
             else if (number < Smallest)
                    Smallest = number;
            }
            System.out.printf("Smallest number %d",Smallest);

        }


    }


