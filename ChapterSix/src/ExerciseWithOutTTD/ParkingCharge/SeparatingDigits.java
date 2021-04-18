package ExerciseWithOutTTD.ParkingCharge;

import java.util.Scanner;

public class SeparatingDigits {
    /*****
     * (Separating Digits) Write methods that accomplish each of the following tasks:
     * a) Calculate the integer part of the quotient when integer a is divided by integer b .
     * b) Calculate the integer remainder when integer a is divided by integer b .
     * c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
     * receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
     * each pair of digits by two spaces. For example, the integer 4562 should appear as
     * 4,5,6,2
     * Incorporate the methods into an application that inputs an integer and calls display-
     * Digits by passing the method the integer entered. Display the results.*****/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter FirstValue");
        int a = input.nextInt();
        System.out.println("Enter SecondValue");
        int b = input.nextInt();
        quotient(a,b);
        divide(a,b);
        System.out.println("Enter the number to separate:");
        displayDigits(input.nextInt());
    }
        private static void quotient(int firstvalue, int secondvalue) {
        int answer = (firstvalue/secondvalue);
        System.out.printf("%d%n",answer);
    }
    private static void divide(int firstvalue, int secondvalue) {
        int answer = (firstvalue % secondvalue);
        System.out.printf("%d%n",answer);
    }
    private static void displayDigits(int value) {
        if (value>=1 && value <=99999){
            int unit = value / 10000;
            int firstNumber = value % 10000;
            int Tenth = firstNumber / 1000;
            int secondNumber = firstNumber % 1000;
            int hundred = secondNumber /100;
            int third = secondNumber % 100;
            int thousand = third / 10;
            int fourth = third % 10;
            System.out.printf("%d %d %d %d %d", unit, Tenth, hundred, thousand, fourth);
        }
        else {
            System.out.println("Enter a Valid input between 1 and 99999");
        }
    }

}
