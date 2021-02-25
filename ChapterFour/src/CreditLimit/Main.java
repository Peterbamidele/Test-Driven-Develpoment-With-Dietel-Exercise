package CreditLimit;

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditLimit creditLimit = new CreditLimit(500, 200, 8442017, 300, 50, 120);

        System.out.println("Enter Account Number(press(-1 to quit):");
        creditLimit.setAccountNumber(input.nextInt());

        while (creditLimit.getAccountNumber() != -1) {
            System.out.print("Enter AccountBalance:");
            creditLimit.setBalanceAtBeginningOfMonth(input.nextInt());

            System.out.print("Enter total of all items Charges:");
            creditLimit.setTotalItemCharged(input.nextInt());

            System.out.print("Enter Credit:");
            creditLimit.setTotalCreditAppliedToCustomer(input.nextInt());

            System.out.print("Enter CreditLimit:");
            creditLimit.setcreditLimit(input.nextInt());

            creditLimit.newBalance = creditLimit.getBalanceAtBeginningOfMonth() + creditLimit.getTotalItemCharged() - creditLimit.getTotalCreditAppliedToCustomer();
            System.out.printf("New balance is :%d\n", creditLimit.newBalance);

            if (creditLimit.newBalance > creditLimit.getcreditLimit()) {
                System.out.println("Credit limit exceeded \n You want dupe Our Bank Abi ");
            } else System.out.print("Thank you for banking with Us\n");

            System.out.println("Enter Account Number(press(-1 to quit):");
            creditLimit.setAccountNumber(input.nextInt());

        }

    }
}