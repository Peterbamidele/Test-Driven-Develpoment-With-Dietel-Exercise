package Factorials;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int number;
        long fact = 1;
        System.out.println("Enter the number:");
        number = input.nextInt();

        System.out.printf("%s\t%s\t\t%n"," numbers:"," fact:");

        for (int i = 1; i <=number; i++) {
            fact = fact * i;
            total = total + 1;
            System.out.printf("\t%d\t\t\t%d\t\n",total,fact);

        }
        System.out.println("\nFactorial of "+ number + " is:" + fact);

    }
}
