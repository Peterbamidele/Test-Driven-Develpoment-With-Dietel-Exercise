package ClassWithMainMethod;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
/*****      4.18 Develop a Java application that will determine whether any of several department-store customers has exceeded the credit limit on a charge account.
 *          For each customer, the following facts are available:
                a) account number
                b) balance at the beginning of the month
                c) total of all items charged by the customer this month
                d) total of all credits applied to the customer’s account this month
                e) allowed credit limit.
            The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits),
            display the new balance and determine whether the new balance exceeds the customer’s credit limit.
            For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded" .? ***/

int account;
int oldbalance;
int charges;
int credit;
int creditLimit;
int newBalance;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Number(press(-1 to quit)):");
        account = input.nextInt();

        while ( account != -1){
            System.out.print("Enter Balance:");
            oldbalance = input.nextInt();

            System.out.print("Enter Charges:");
            charges = input.nextInt();

            System.out.print("Enter Credit");
            credit = input.nextInt();

            System.out.print("Enter CreditLimit");
            creditLimit = input.nextInt();

            newBalance = oldbalance + charges - credit;
            System.out.printf("New balance is %d\n",newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
            else
                System.out.print("You want dupe Our Bank Abi");


            System.out.print("\n\"Enter Account Number(press(-1 to quit))");
            account = input.nextInt();
        }



    }
}
